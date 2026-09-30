import java.util.Scanner;

public class Luogu_P5727_HailtoneGuess {
    public static void main(String[] args) {
        /*给出一个正整数 n，然后对这个数字一直进行下面的操作：
        如果这个数字是奇数，那么将其乘 3 再加 1，否则除以 2。
        经过若干次循环后，最终都会回到 1。
        根据给定的数字，验证这个猜想，并从最后的 1 开始，倒序输出整个变化序列。*/
//        思路：定义方法判断奇数偶数并根据对应情况求所值，分别存入数组中，直到出现1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        hailstone(n);
    }

    //    定义方法
    public static void hailstone(int n) {
        //       定义一个数组
        int[] arr = new int[1000];   // 把数组开大，足够存放冰雹序列
        int i = 0;

        while (true) {
            arr[i] = n;
            if (n == 1) {

                break;
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {

                n = n * 3 + 1;
            }
            i++;

        }
// 倒序输出整个序列
        for (int j = i; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }

}
