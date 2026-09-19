//        打乱数组中的数据
//
//需求:已知数组元素为{1,2,3,4,5,6,7,8,9,10}
//
//要求:打乱数组中的数据
import java.util.Random;
public class ArrayShuffle {

    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        1.先生成随机数
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
//            2.交换数据
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
