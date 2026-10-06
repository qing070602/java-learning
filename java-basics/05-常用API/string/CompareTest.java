package string;

import java.util.Scanner;

public class CompareTest {
    //练习:
//已知正确的用户名和密码,请用程序实现模拟用户登录
//总共给三次机会,登录之后,给出相应的提示
    public static void main(String[] args) {
        String rightUsername = "admin";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            boolean b1 = rightUsername.equals(username);
            boolean b2 = rightPassword.equals(password);
            if (b1 && b2) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("用户名或密码错误,请重新输入,您还有" + (2 - i) + "次机会");
            }
        }
    }
}
