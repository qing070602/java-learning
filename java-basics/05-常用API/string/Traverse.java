package string;

import java.util.Scanner;

public class Traverse {
//    需求:键盘录入一个字符串,使用程序实现在控制台遍历该字符串
    public static void main(String[] args) {
//        获取字符串长度
        /*String str = "shds23s";
        int length = str.length();
        System.out.println("字符串长度为:" + length);
//        根据索引获取值
        char c = str.charAt(0);
        System.out.println("索引为3的字符为:" + c);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("索引为" + i + "的字符为:" + c);
        }

    }
}
