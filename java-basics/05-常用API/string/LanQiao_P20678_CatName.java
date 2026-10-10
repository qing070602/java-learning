package string;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改
import java.util.ArrayList;
public class LanQiao_P20678_CatName {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //在此输入您的代码...
              ArrayList<String> list = new ArrayList<>();

               for(int i = 0;i < 6;i++){
                 String s = scan.next();
                 list.add(s);

                 }
                for(int i = 0;i < list.size();i++){
                    String str = list.get(i);
                    char firstChar = str.charAt(0);
                    System.out.print(firstChar);
                }
           /* for(int i = 0;i < 6;i++){
                String s = scan.next();
                System.out.print(s.charAt(0));
            }*/

            scan.close();
        }

}
