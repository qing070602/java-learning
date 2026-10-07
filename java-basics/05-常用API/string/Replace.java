package string;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
//        需求:
//过滤玩游戏中骂人的脏话
//        1.定义一个敏感词数组
        String[] arr = {"傻逼", "sb", "傻子", "垃圾"};
//        2.定义一个字符串,模拟用户输入的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段话:");
        String str = sc.next();
        for (int i = 0; i < arr.length; i++) {
            str =str.replace(arr[i],"***");

        }
        System.out.println(str);
    }

}
