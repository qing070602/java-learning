public class ArrayFastSlowPointer {
    public static void main(String[] args) {
//        // 给定义一个递增有序数组,去除其中重复元素
        /*慢指针:存入的位置
快指针:找不重复的数据
相等→→舍弃快指针位置的数据
不等→→快指针的数据存入慢指针位置*/

//        1.定义一个递增数组
        int [] arr = {1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9};
//        2.定义慢指针和快指针
        int slow = 0;
        int fast = 1;
//        3.循环遍历数组，相等→→舍弃快指针位置的数据，不等→→快指针的数据存入慢指针位置(慢指针先移动，再存入)
       while(fast < arr.length) {
           if(arr[slow] != arr[fast]) {
               slow++;
               arr[slow] = arr[fast];
           }
           fast++;
       }
        System.out.print("{");
        for (int i = 0; i <= slow; i++) {
            if(i != slow) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }

        }
        System.out.print("}");
    }
}
