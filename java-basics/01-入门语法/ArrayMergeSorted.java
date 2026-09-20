public class ArrayMergeSorted {
//    给你两个有序数组 arr1 和 arr2
//
//将两个数组中的数据合并到一个大数组中。
//
//要求:合并之后的大数组也是有序的

    public static void main(String[] args) {
        // 双指针
        int[] arr1 = {1, 3, 5, 7,8};
        int[] arr2 = {2, 4, 6, 8,9,10};

        int[] merged = new int[arr1.length + arr2.length];


        int i = 0; // 指向 arr1
        int j = 0; // 指向 arr2
        int k = 0; // 指向 merged 的下一个位置（合并后的数组）

        // 两个数组都还有元素时，比较当前元素
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
//            无论哪种情况，merged 的下一个位置都要移动
            k++;
        }

        // arr2 已遍历完，复制 arr1 剩下的元素
        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // arr1 已遍历完，复制 arr2 剩下的元素
        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // 输出结果
        System.out.print("[");
        for (int x = 0; x < merged.length; x++) {
            if (x > 0) {
                System.out.print(", ");
            }
            System.out.print(merged[x]);
        }
        System.out.println("]");
    }

}
