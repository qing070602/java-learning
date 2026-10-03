package loop;

//import java.util.Random;
import java.util.Scanner;

public class LuoGu_P5721_NumberRightTriangle {
    //    给出 n，请输出一个直角边长度是 n 的数字直角三角形。
//    所有数字都是 2 位组成的，如果没有 2 位则加上前导 0。
    public static void main(String[] args) {
        /*
        n = 5
        0102030405
        06070809
        101112
        1314
        15
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Random r = new Random();

//        随机数做法

////        外循环，控制行数
//        for (int i = 0; i < n; i++) {
////            内循环控制内容
//          for(int j = i;j<n;j++){
////              随机生成数字，判断小于10的前面补0
//              int num = r.nextInt(100);
//              if(num<10){
//                  System.out.print("0"+num);
//              }else{
//                  System.out.print(num);
//              }
//          }
//            System.out.println();
//        }

//        顺序数做法
        int num = 1;
        for (int i = 0; i < n; i++) {
            for(int j = i;j<n;j++){
                System.out.printf("%02d",num++);
            }
            System.out.println();
        }
    }
}
