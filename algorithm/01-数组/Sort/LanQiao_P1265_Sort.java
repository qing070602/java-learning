package Sort;

import java.util.Scanner;

public class LanQiao_P1265_Sort {
    //    给定一个长度为N的数组A
//请你先从小到大输出它的每个元素，再从大到小输出它的每个元素。
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
//        输入数值
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
//        排序
//        快速排序
        quickSort(A, 0, N - 1);
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
            if(i == N - 1){
                System.out.println();
            }
        }

//        从大到小输出
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
//        Lambda表达式排序
        /*// 从小到大排序
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if (i == n - 1) {
                System.out.println();
            }
        }
        // 从大到小排序
        Arrays.sort(arr,(a,b)->Integer.compare(b,a));
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            }
        }*/
    }
    public static void quickSort(int[] A, int i, int j) {
        int start = i;
        int end = j;

        if(start >= end){
            return;
        }
//        把边界判断放到取基准数之前：否则递归调用产生 i > j 时，代码仍会先执行 A[i]，
        int baseNumber = A[i];//基准数
//        小于或者不想等执行循环
        while (start != end) {
//        end从后往前找比基准数小的数
            while (true) {
//            找到就停止循环
                if (start >= end || A[end] < baseNumber) {
                    break;
                }
                end--;
            }
//        start从前往后找比基准数大的数
            while (true) {
//            找到就停止循环
                if (start >= end || A[start] > baseNumber) {
                    break;
                }
                start++;
            }
//            交换两个数
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;

        }
//        基准数归位
        int temp = A[i];
        A[i] = A[start];
        A[start] = temp;
//        递归调用
        quickSort(A, i, start - 1);
        quickSort(A, start + 1, j);
    }
}
