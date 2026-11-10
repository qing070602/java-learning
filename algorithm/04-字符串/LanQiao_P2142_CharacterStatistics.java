import java.util.HashMap;
import java.util.Scanner;
public class LanQiao_P2142_CharacterStatistics {


    /*
     * 蓝桥云课 2142：字符统计
     * 原题：https://www.lanqiao.cn/problems/2142/learning/
     * 知识点标签：字符串、计数数组、哈希表、最大值、并列输出
     *
     * 要求：
     * 找出出现次数最多的大写字母。
     * 如果有多个并列，按字母表顺序输出所有字母。
     *
     * 易错点：
     * 1. 遍历字符串要使用 s.length()，不能固定写 26。
     * 2. 并列时要输出所有符合条件的字母，不输出次数。
     * 3. HashMap 不保证遍历顺序，需要按 A～Z 检查输出。
     *
     * 两种方法的时间复杂度均为 O(n)，n 为字符串长度。
     * 除输入字符串外，计数和输出使用的空间均为 O(1)：
     * 因为题目限定只有 26 个大写字母。
     */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();

            // 可切换为 solveWithMap(s)。
            System.out.println(solveWithArray(s));

            scan.close();
        }

        // 方法一：计数数组
        public static String solveWithArray(String s) {
            int[] cnt = new int[26];

            for (int i = 0; i < s.length(); i++) {
                cnt[s.charAt(i) - 'A']++;
            }

            int max = 0;
            for (int i = 0; i < 26; i++) {
                if (cnt[i] > max) {
                    max = cnt[i];
                }
            }

            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (cnt[i] == max) {
                    answer.append((char) ('A' + i));
                }
            }

            return answer.toString();
        }

        // 方法二：哈希表
        public static String solveWithMap(String s) {
            HashMap<Character, Integer> cnt = new HashMap<>();
            int max = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                // 字母不存在时，原次数按 0 计算。
                int times = cnt.getOrDefault(ch, 0) + 1;
                cnt.put(ch, times);

                if (times > max) {
                    max = times;
                }
            }

            StringBuilder answer = new StringBuilder();

            // 按字母表顺序检查，不依赖 HashMap 的遍历顺序。
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                if (cnt.getOrDefault(ch, 0) == max) {
                    answer.append(ch);
                }
            }

            return answer.toString();
        }
    }

