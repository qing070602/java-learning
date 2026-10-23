package Sort;
//package Sort;

import java.util.Arrays;

// 选择排序
public class ChooseSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // 每轮选择最小的元素放到前面
        for (int i = 0; i < arr.length - 1; i++) {
            // 假设当前位置是最小元素的位置
            int minIndex = i;

            // 在未排序部分寻找最小元素
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 将最小元素交换到当前位置
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.println("排序后的数组为：" + Arrays.toString(arr));
    }
}
