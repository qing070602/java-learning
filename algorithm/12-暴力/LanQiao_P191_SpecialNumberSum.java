import java.util.Scanner;

/*
 * 蓝桥云课 191：特别数的和
 *
 * 我的思路：
 * 枚举 1 到 n，用 % 10 取出末位，用 / 10 去掉末位。
 * 只要某一位是 2、0、1、9，就累加原数并停止检查当前数。
 *
 * 本次结果：本地 16 组测试全部通过，没有发现逻辑错误。
 *
 * 易错点复盘：
 * 1. 用临时变量 x 拆数，不能修改外层循环变量 i。
 * 2. 累加的是原数 i，不是数位 ge，也不是拆分后的 x。
 * 3. 同一个数只能累加一次，例如 11 只能加一次 11。
 * 4. break 只退出内层 while，外层 for 会继续。
 * 5. 当前数位未匹配时，要执行 x /= 10，否则可能死循环。
 * 6. 题目包含 n，循环条件应为 i <= n。
 *
 * 复杂度：
 * 时间 O(n * d)，d 为 n 的十进制位数。
 * 额外空间 O(1)。
 *
 * 数值范围：
 * n <= 10000，即使所有数都相加也只有 50005000，int 足够。
 *
 * 解法比较：
 * 当前写法找到匹配数位就停止，已减少不必要的检查。
 * 也可以转字符串后用 contains 判断，但会创建字符串，
 * 不必然更快；本题保留当前数位拆分写法即可。
 */
public class LanQiao_P191_SpecialNumberSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int x = i;
            while (x > 0) {
                int ge = x % 10;
                if (ge == 2 || ge == 0 || ge == 1 || ge == 9) {
                    sum += i;
                    break;
                }
                x /= 10;
            }
        }

        System.out.println(sum);
        scan.close();
    }
}
