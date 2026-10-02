package loop;

import java.util.Scanner;

public class LuoGu_P5718_FindMin {
    /*输入格式
第一行输入一个正整数 n，表示数字个数。

第二行输入 n 个非负整数，以空格隔开。

输出格式
输出一个非负整数，表示这 n 个非负整数中的最小值。*/
    static void main() {
//        定义一个整数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("请输入" + n + "个非负整数：");
//        循环输入n个非负整数，并定义一个最小值，循环比较
//        读取第一个数作为初始最小值
        int min = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println("最小值为：" + min);
    }
}
