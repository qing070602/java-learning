package Sort;
//冒泡排序
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
//        定义一个数组
        int[] arr = {5, 2, 9, 1, 5, 6};
//        冒泡排序
//        外循环：进行几轮
        for (int i = 0; i < arr.length - 1; i++) {
//            内循环：每一轮比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                比较相邻的两个元素
                if (arr[j] > arr[j + 1]) {
//                    交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
