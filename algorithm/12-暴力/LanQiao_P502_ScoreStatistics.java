import java.util.Scanner;

public class LanQiao_P502_ScoreStatistics {

    /*
     * 蓝桥云课 502：成绩统计
     * 原题：https://www.lanqiao.cn/problems/502/learning/
     * 标签：模拟、计数、百分比计算
     * 来源：2020 年蓝桥杯省赛
     *
     * 思路：
     * 逐个读入成绩，分别统计及格人数和优秀人数。
     * 将人数转换为百分比，四舍五入后输出。
     *
     * 本次易错点：
     * 1. 优秀学生已经被 >= 60 的判断计入及格人数，
     *    不能在优秀判断中再次增加及格人数。
     *    反例：只有一名 100 分学生，及格人数应为 1。
     *
     * 2. 两个整数相除会丢掉小数，例如 3 / 7 得到 0。
     *    使用 cnt * 100.0 / n，保证进行浮点数计算。
     *
     * 3. Java 中 % 是取余运算符。
     *    输出百分号要拼接字符串 "%"。
     *
     * 4. 强制转 int 会直接截去小数，不能代替四舍五入。
     *    Math.round(double) 返回 long，可直接用 long 接收。
     *
     * 改进：
     * 成绩只用于统计，后面不需要再次访问，因此不用数组。
     * 输入保证成绩在 0～100，优秀判断只需 score >= 85。
     *
     * 时间复杂度：O(n)
     * 额外空间复杂度：O(1)
     */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int cnt1 = 0;
            int cnt2 = 0;

            for (int i = 0; i < n; i++) {
                int score = scan.nextInt();

                // 优秀学生也属于及格学生，两项分别统计。
                if (score >= 60) {
                    cnt1++;
                }
                if (score >= 85) {
                    cnt2++;
                }
            }

            long passRate = Math.round(cnt1 * 100.0 / n);
            long excellentRate = Math.round(cnt2 * 100.0 / n);

            System.out.println(passRate + "%");
            System.out.println(excellentRate + "%");
            scan.close();
        }
    }

