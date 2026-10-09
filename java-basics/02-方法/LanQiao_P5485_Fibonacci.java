import java.util.Scanner;

public class LanQiao_P5485_Fibonacci {


    // 1:无需package
// 2: 类名必须Main, 不可修改
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        System.out.
                println(Fibonacci(n));
        scan.close();
    }
    public static int Fibonacci(int n) {
        int firstnums = 1;
        int secondnums = 1;
        if (n == 1 || n == 2) return 1;
        for (int i = 2; i < n; i++) {
            int nextnums = firstnums + secondnums;
            firstnums = secondnums;
            secondnums = nextnums;
        }
        return secondnums;
    }*/
//        数组版
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();

        System.out.println(Fibonacci(n));
        scan.close();
    }

    public static int Fibonacci(int n) {
        int[] arr = new int[41];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }
}


