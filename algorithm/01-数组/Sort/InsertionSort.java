package Sort;

import java.util.Arrays;

//插入排序
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 3, 4, 7, 8, 0};

        // 默认第一个元素是有序部分
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // 将比 current 大的元素向后移动
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // 插入到正确位置
            arr[j + 1] = current;
        }

        System.out.println("排序后的数组为：" + Arrays.toString(arr));
    }
}

/// /        将无序的部分插入到有序的部分
/// /        定义一个数组
//        int[] arr = {5, 2, 9, 1, 5, 6,3,4,7,8,0};
////        1.寻找有序的部分
//        int startIndex = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > arr[i + 1]) {
//                startIndex = i + 1;
//                break;
//            }
//        }//此时startIndex就是无序部分的第一个元素的下标
////        2.将无序部分的元素插入到有序部分
//        for(int i = startIndex;i < arr.length;i++){
//            int j = i;
//            while(j > 0 && arr[j] < arr[j - 1]){
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//                j--;
//            }
//        }
//        System.out.println("排序后的数组为：" + Arrays.toString(arr));
//    }
//}
