package Sort;
import java.util.Arrays;
public class QuickSort {
    //    快速排序
    public static void main(String[] args) {
//        以0索引的数为基准数，确定基准数的最终位置，找出比基准数小的数放在左边，比基准数大的数放在右边
        int[] arr = {5, 2, 9, 1, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后的数组为：" + java.util.Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int i, int j) {
//        定义两个指针，分别指向数组的两端
        int start = i;
        int end = j;
        if(start >= end){
            return;
        }
//        定义基准数
        int pivot = arr[i];
//        当start小于end时，循环
        while (start != end) {
//            end从后往前找小于基准数的数
            while (true) {
//                找到需要的值后停止循环
                if(start >= end || arr[end] < pivot){
                    break;
                }
                end--;
            }
//            start从前往后找大于基准数的数
            while (true) {
                if(start >= end || arr[start] > pivot){
                    break;
                }
                start++;
            }
//            找到交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
//        基准数归位，和start指向的数交换
       int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
//        递归调用，分别对基准数左边和右边的数组进行排序
            quickSort(arr, i, start - 1);
            quickSort(arr, start + 1, j);
    }
}
