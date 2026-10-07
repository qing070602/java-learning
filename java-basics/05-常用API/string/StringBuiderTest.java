package string;

public class StringBuiderTest {
    public static void main(String[] args) {
//        StringBuilder的常见成员方法:
//append(任意类型)//添加数据
//reverse()//反转
//int length()//获取长度
//toString变回字符串
        StringBuilder str = new StringBuilder("123");
        System.out.println(str + "---");
        System.out.println(str.length());
        str.append("hello");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        String s = str.toString();
        System.out.println(s);
    }
}
