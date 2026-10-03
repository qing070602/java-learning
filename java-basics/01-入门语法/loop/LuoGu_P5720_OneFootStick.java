package loop;

import java.util.Scanner;

public class LuoGu_P5720_OneFootStick {
//    第一天有一根长度为 a 的木棍，从第二天开始，每天都要将这根木棍锯掉一半（每次除 2，向下取整）。
//    第几天的时候木棍的长度会变为 1？

//    while循环，循环刷新a的值，直到a=1，利用计数器记录天数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int days = 1; // 从第一天开始计数
        while(a > 1) {
            a /= 2; // 每天锯掉一半
            days++; // 天数加1
        }
        System.out.println(days);
    }
}
