
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class LanQiao_P21596_WordMerging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> dict = new HashSet<>();
        //在此输入您的代码...
        int n = scan.nextInt();
        // 初始化单词对数
        int ans = 0;
        // 输入单词
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            // 将单词放进集合和哈希集合里面
            list.add(str);//list集合可以遍历
            dict.add(str);//哈希集合只能判断里面有没有这个字符串，去重无序的
        }
        // 遍历每一个单词
        for (String s : list) {
            // 局部定义一个哈希集合
            HashSet<String> cur = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                // 删除第i个字符，（0，i）包头不包尾，（i）从头到尾
                String shorter = s.substring(0, i) + s.substring(i + 1);
                // 如果局部哈希集合里有这个单词并且上面输入进来的单词里面也有这个单词，说明找到一个
                // cotains判断是否存有
                if (cur.add(shorter) && dict.contains(shorter)) {
                    ans++;
                }
            }
        }
        System.out.println(ans * 2);
        scan.close();
    }
}

