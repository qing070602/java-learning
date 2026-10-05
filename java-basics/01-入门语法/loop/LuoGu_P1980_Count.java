package loop;

import java.util.Scanner;

public class LuoGu_P1980_Count {
    //    试计算在区间 1 到 n 的所有整数中，数字 x（0≤x≤9）共出现了多少次？
//    例如，在 1 到 11 中，即在 1,2,3,4,5,6,7,8,9,10,11 中，数字 1 出现了 4 次。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == x) {
                    count++;
                }
                temp /= 10;
            }
        }
        System.out.println(count);
    }
}
