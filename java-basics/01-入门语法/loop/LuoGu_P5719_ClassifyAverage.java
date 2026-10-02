package loop;

import java.util.Scanner;

public class LuoGu_P5719_ClassifyAverage {
    public static void main(String[] args) {
        /*给定 n 和 k，将从 1 到 n 之间的所有正整数可以分为两类：
        A 类数可以被 k整除（也就是说是  k的倍数），而 B 类数不能。
        请输出这两类数的平均数，精确到小数点后 一 位，用空格隔开。
数据保证两类数的个数都不会是0。
输入格式
输入两个正整数 n 与k 。
输出格式
输出一行，两个实数，分别表示 A 类数与 B 类数的平均数。精确到小数点后一位。*/
//        输入两个正整数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        定义两个变量计算A类数和B类数的和
        int sumA = 0;
        int sumB = 0;
//        定义两个变量计算A类数和B类数的个数
        int countA = 0;
        int countB = 0;
        for (int i = 1; i <= n; i++) {
            if(i % k == 0) {
                sumA += i;
                countA++;
            } else {
                sumB += i;
                countB++;
            }
        }
//        计算平均数
        double averageA = (double) sumA / countA;
        double averageB = (double) sumB / countB;
//        输出平均数，精确到小数点后一位
        System.out.printf("%.1f %.1f", averageA, averageB);
    }
}
