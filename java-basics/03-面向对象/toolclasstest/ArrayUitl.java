package toolclasstest;

public class ArrayUitl {
    private ArrayUitl() {
    }

    //    1. 提供一个方法printArr,用于遍历数组。
//格式如下:[10,20,50,34,100](只考虑整数数组)
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    //2. 提供一个方法getAverage,用于返回平均分。
    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
