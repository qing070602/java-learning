import java.util.Scanner;

public class Luogu_P1047_TreesOutsideSchool {
    public static void main(String[] args) {
//        题目描述
//        某校大门外长度为 l 的马路上有一排树，每两棵相邻的树之间的间隔都是 1 米。
//        我们可以把马路看成一个数轴，马路的一端在数轴 0 的位置，另一端在 l 的位置；
//        数轴上的每个整数点，即 0,1,2,…,l，都种有一棵树。
//        由于马路上有一些区域要用来建地铁。这些区域用它们在数轴上的起始点和终止点表示。
//        已知任一区域的起始点和终止点的坐标都是整数，区域之间可能有重合的部分。
//        现在要把这些区域中的树（包括区域端点处的两棵树）移走。
//        你的任务是计算将这些树都移走后，马路上还有多少棵树。


//        输入格式
//第一行有两个整数，分别表示马路的长度 l 和区域的数目 m。
//接下来 m 行，每行两个整数 u,v，表示一个区域的起始点和终止点的坐标。
//输出格式
//输出一行一个整数，表示将这些树都移走后，马路上剩余的树木数量。

//        标记法
//        1.定义两个整数
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int m = sc.nextInt();
//        2.定义一个数组，长度为l+1，表示每个位置是否有树
        boolean[] hasTree = new boolean[l + 1];
//        3.初始化数组，所有位置都有树
        for (int i = 0; i <= l; i++) {
            hasTree[i] = true;
        }
//        4.循环输入m个区域，移走树
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
//            5.移走树
            for (int j = u; j <= v; j++) {
                hasTree[j] = false;
            }
        }
//        6.统计剩余的树木数量
        int count = 0;
        for (int i = 0; i <= l; i++) {
            if (hasTree[i]) {
                count++;
            }
        }
//        7.输出结果
        System.out.println(count);
    }
}