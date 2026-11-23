import java.util.HashMap;
import java.util.Map;

public class LeetCode_p1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // key 是已经遍历过的数字，value 是这个数字在原数组中的下标
        // 题目要返回下标，所以找到数字后还需要知道它的位置
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            // 如果 current + complement = target，
            // 那么 complement 就是当前数字还差的那个数
            int complement = target - current;

            // 先查补数。此时表里只有下标小于 i 的元素，
            // 所以查到的元素和当前元素一定是两个不同的位置
            if (indexByValue.containsKey(complement)) {
                int previousIndex = indexByValue.get(complement);

                // 返回补数的下标和当前下标
                return new int[]{previousIndex, i};
            }

            // 本轮没找到配对，再把当前数字和下标存进去，
            // 让后面的元素有机会和它配对
            indexByValue.put(current, i);
        }

        // 题目保证有解，合法输入会在循环内直接返回
        return new int[0];
    }
}