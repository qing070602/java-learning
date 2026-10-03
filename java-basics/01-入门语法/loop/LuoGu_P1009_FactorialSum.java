package loop;

/*
import java.util.Scanner;

public class LuoGu_P1009_FactorialSum {
    //    用高精度计算出 S=1!+2!+3!+⋯+n!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // 计算阶乘
            sum += factorial; // 累加阶乘和
        }
        System.out.println(sum);
    }
}
*/
import java.math.BigInteger;
import java.util.Scanner;

public class LuoGu_P1009_FactorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger sum = BigInteger.ZERO;   // 总和，初始为 0
        BigInteger factorial = BigInteger.ONE; // 当前阶乘，初始为 1

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // factorial *= i
            sum = sum.add(factorial); // sum += factorial
        }

        System.out.println(sum);
    }
}
