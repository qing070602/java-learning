public class TrapppingRainWater {

    public static void main(String[] args) {
        // 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，
        // 计算按此排列的柱子下雨之后能接多少雨水。
        // 输入：[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
        // 输出：6
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int[] leftMax = new int[heights.length];
        int currentMax = 0;

        // 从左往右记录每个位置左侧（包含当前位置）的最高柱子。
        for (int i = 0; i < heights.length; i++) {
            currentMax = Math.max(currentMax, heights[i]);
            leftMax[i] = currentMax;
        }

        int[] rightMax = new int[heights.length];
        currentMax = 0;

        // 从右往左记录每个位置右侧（包含当前位置）的最高柱子。
        for (int i = heights.length - 1; i >= 0; i--) {
            currentMax = Math.max(currentMax, heights[i]);
            rightMax[i] = currentMax;
        }

        int trappedWater = 0;

        // 每个位置的积水高度等于左右最高柱子中的较小值减去当前柱高。
        for (int i = 0; i < heights.length; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }

        System.out.println(trappedWater);
    }
}
