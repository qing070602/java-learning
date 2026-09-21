//二路归并思想
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        /*中位数
        给定两个正序数组arr1和arr2,请先合并数组,并找出合并之后数组的中位数。
        举例:
        123456789
        中位数:5
        123456
        中位数:( 3+4 ) / 2*/

//        1.定义两个正序数组
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
double number = findMedianSortedArrays(arr1,arr2);
        System.out.println(number);


    }
    //快捷的思路:在添加的过程中,保证顺序
//前提:arr1,arr2必须是正序的
//    定义方法合并后求中位数
public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
//        2.定义一个合并数组
    int[] arr = new int[arr1.length + arr2.length];
    //        合并两个数组
//    谁小谁先排
//    设置两个数组的0索引
    int idex1 = 0;
    int idex2 = 0;
//    遍历合并数组
    for (int i = 0; i < arr.length; i++) {
//        arr1是短的
        if (idex1 == arr1.length) {
            arr[i] = arr2[idex2];
            idex2++;
            continue;
        }
//        arr2是短的
        if (idex2 == arr2.length) {
            arr[i] = arr1[idex1];
            idex1++;
            continue;
        }
//        判断指向的元素，谁小添加谁
        if (arr1[idex1] < arr2[idex2]) {
            arr[i] = arr1[idex1];
            idex1++;
        } else {
            arr[i] = arr2[idex2];
            idex2++;
        }
    }
//        求中位数
    if (arr.length % 2 == 1) {
        return arr[arr.length / 2];
    } else {
        return (double)(arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
    }

}
}