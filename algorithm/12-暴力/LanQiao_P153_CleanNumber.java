import java.util.Scanner;

public class LanQiao_P153_CleanNumber {


    /*
     * 蓝桥云课 153：洁净数
     * 原题：https://www.lanqiao.cn/problems/153/learning/
     * 知识点标签：枚举、数位拆分、条件判断、计数
     *
     * 题意：
     * 统计 1～n 中，十进制数位不含 2 的正整数个数。
     *
     * 易错点：
     * 1. 用临时变量 x 拆分数位，不能修改外层循环变量 i。
     * 2. 发现一个数位为 2，就应停止检查当前数。
     * 3. 每个洁净数只计数一次，不是每个合格数位计数一次。
     * 4. 数字 0 作为数位是允许的，例如 10 是洁净数。
     *
     * 设 n 的位数为 d：
     * 时间复杂度 O(n * d)，额外空间复杂度 O(1)。
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 默认运行你的解法；可改为 solveWithFlag(n)。
        System.out.println(solveOriginal(n));

        scan.close();
    }

    // 解法一：你的写法，走到最高位时计数。
    public static int solveOriginal(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int x = i;

            while (x > 0) {
                // 走到最高位，且最高位不是 2，说明这个数是洁净数。
                if (x < 10 && x != 2) {
                    cnt++;
                }

                int ge = x % 10;
                if (ge == 2) {
                    break;
                }

                x /= 10;
            }
        }

        return cnt;
    }

    // 解法二：用标记记录检查结果，检查完后再决定是否计数。
    public static int solveWithFlag(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int x = i;
            boolean clean = true;

            while (x > 0) {
                if (x % 10 == 2) {
                    clean = false;
                    break;
                }
                x /= 10;
            }

            if (clean) {
                cnt++;
            }
        }

        return cnt;
    }
}

