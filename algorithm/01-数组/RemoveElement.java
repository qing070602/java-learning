import java.util.Scanner;

public class RemoveElement {
//    移除元素
//
//给你一个数组 nums和一个值val,你需要删除所有数值等于val的元素
//举例1:
//输入:nums=[3,2,2,3] val=3
//输出:nums=[2,2]剩余2个元素
//举例2:
//输入:nums=[0,1,2,2,3,0,4,2] val=2
//输出:nums=[0,1,4,0,3]剩余5个元素
    public static void main(String[] args) {
//        1.定义一个数组和要删除的元素
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
//        2.定义一个慢指针和快指针
        int slow = 0;
        int fast = 0;
//        思路：双针在0索引，慢指针记录索引和剩余的个数，快指针遍历整个数组，快指针走如果不等于val,
//        就把快指针的值赋给慢指针，然后慢指针加一，相等只需要快指针相加，知道数组遍历完

        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
//        3.输出剩余的元素个数和数组

        System.out.print("nums = [");
        for (int i = 0; i < slow; i++) {
            if(i != slow - 1){
                System.out.print(nums[i] + ",");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");
        System.out.println("剩余元素个数为：" + slow);
    }




}
