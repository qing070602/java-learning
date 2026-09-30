import java.util.Scanner;

public class Luogu_P1427_FishNumberGame {
    public static void main(String[] args) {
        /*输入格式
一行内输入一串整数，以 0 结束，以空格间隔。

输出格式
一行内倒着输出这一串整数，以空格间隔。*/
//        思路：1.while循环，判断输入的数是否为0，若不是则存入数组，若是则结束循环
//        2.倒序输出数组
        Scanner sc = new Scanner(System.in);
//        定义一个数组不超过100个数
        int[] arr = new int[100];

//        循环获取数字
       int x;
        int i = 0;
        while((x = sc.nextInt()) != 0) {

            arr[i] = x;
            i++;
        }
//        倒序输出数组
        for (int j = i - 1; j >= 0 ; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
