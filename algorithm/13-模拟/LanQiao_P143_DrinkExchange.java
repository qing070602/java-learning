import java.util.Scanner;

public class LanQiao_P143_DrinkExchange {


    /*
     * 蓝桥云课 143：饮料换购
     * 原题：https://www.lanqiao.cn/problems/143/learning/
     * 知识点标签：模拟、循环、整除与取余、状态更新
     *
     * 规则：三个瓶盖兑换一瓶饮料，新饮料喝完后也产生瓶盖。
     *
     * 本次易错点：
     * 1. 必须明确变量表示“累计数量”还是“当前剩余数量”。
     * 2. while 解法中，兑换后剩余瓶盖应重新计算，
     *    不能写成 caps += caps % 3，否则可能无法结束。
     * 3. 至少有三个瓶盖才能兑换，条件是 caps >= 3。
     * 4. 总饮料数要包含最初购买的 n 瓶。
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 默认使用 for 解法；改为 solveWhile(n) 可运行另一种。
        System.out.println(solveFor(n));

        scan.close();
    }

    /*
     * 解法一：for 循环，每轮兑换一瓶。
     *
     * total：累计喝到的饮料数，也等于累计产生的瓶盖数。
     * i：完成当前兑换，累计需要消耗的瓶盖数。
     *
     * 每轮 i 增加 3，total 增加 1，最终一定会停止。
     *
     * 时间复杂度：O(n)
     * 额外空间复杂度：O(1)
     */
    public static int solveFor(int n) {
        int total = n;

        for (int i = 3; i <= total; i += 3) {
            total++;
        }

        return total;
    }

    /*
     * 解法二：while 循环，每轮批量兑换。
     *
     * caps：当前剩余瓶盖数。
     * total：累计喝到的饮料数。
     *
     * caps / 3：本轮换到的饮料数，也是喝完后新增的瓶盖数。
     * caps % 3：本轮没有用掉的旧瓶盖数。
     *
     * 时间复杂度：O(log n)
     * 额外空间复杂度：O(1)
     */
    public static int solveWhile(int n) {
        int caps = n;
        int total = n;

        while (caps >= 3) {
            total += caps / 3;
            caps = caps / 3 + caps % 3;
        }

        return total;
    }
}

