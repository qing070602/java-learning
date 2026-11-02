import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
public class LanQiao_P671_MagicNumber {


    /*
     * 蓝桥云课 671：奇妙的数字
     * 原题：https://www.lanqiao.cn/problems/671/learning/
     * 知识点标签：枚举、数位拆分、集合、计数数组、字符串、排序
     *
     * 要求：平方和立方的数位合起来，恰好包含 0～9 各一次。
     *
     * 易错点：
     * 1. 每次尝试新整数，都要重新统计数位。
     * 2. HashSet 会去重，集合版必须同时检查总位数。
     * 3. 字符串拼接不是把平方和立方相加。
     * 4. 计数数组版要求每个数字的次数都等于 1。
     *
     * 本题三个方法均在 i = 69 时结束，此前 int 足够。
     * 若扩展枚举范围，需要重新检查平方、立方是否溢出。
     */

        public static void main(String[] args) {
            // 可切换：solveWithList、solveWithArray、solveWithSort
            System.out.println(solveWithSort());
        }

        // 解法一：列表记录数位，集合检查是否包含全部数字。
        public static int solveWithList() {
            HashSet<Integer> target = new HashSet<>();
            for (int digit = 0; digit <= 9; digit++) {
                target.add(digit);
            }

            ArrayList<Integer> digits = new ArrayList<>();

            for (int i = 1; ; i++) {
                digits.clear();

                int square = i * i;
                int cube = i * i * i;

                while (square > 0) {
                    digits.add(square % 10);
                    square /= 10;
                }

                while (cube > 0) {
                    digits.add(cube % 10);
                    cube /= 10;
                }

                // 总共十位，并且包含全部十种数字。
                if (digits.size() == 10
                        && target.equals(new HashSet<>(digits))) {
                    return i;
                }
            }
        }

        // 解法二：计数数组，直接判断每个数字是否恰好出现一次。
        public static int solveWithArray() {
            for (int i = 1; ; i++) {
                int[] count = new int[10];
                int square = i * i;
                int cube = i * i * i;

                while (square > 0) {
                    count[square % 10]++;
                    square /= 10;
                }

                while (cube > 0) {
                    count[cube % 10]++;
                    cube /= 10;
                }

                boolean valid = true;
                for (int times : count) {
                    if (times != 1) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    return i;
                }
            }
        }

        // 解法三：字符串拼接后排序，代码最简洁。
        public static int solveWithSort() {
            for (int i = 1; ; i++) {
                // 中间加空字符串，使两个计算结果进行字符串拼接。
                String s = (i * i) + "" + (i * i * i);
                char[] digits = s.toCharArray();
                Arrays.sort(digits);

                // 完整相等，同时保证总位数和每个数字的出现次数。
                if (new String(digits).equals("0123456789")) {
                    return i;
                }
            }
        }
    }

