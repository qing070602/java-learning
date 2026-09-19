import java.util.Random;

public class ArrayDistinct {


        /*去除重复元素(力扣算法)

        需求:获取10个1-100之间的随机数并存入到数组当中,要求保证数据是唯一的*/
        public static void main(String[] args) {
            Random r = new Random();
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; ) {
//            1~100之间的随机数
                int randomNumber = r.nextInt(100) + 1;

            /*// 将当前随机数与前面已经保存的数字比较
            boolean repeat = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == randomNumber) {
                    repeat = true;
                    break;
                }
            }

            if (repeat) {
                // 发现重复，抵消本次循环，重新生成当前下标的数字
                i--;
            } else {
                arr[i] = randomNumber;
            }
        }*/
//            计数器思维
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == randomNumber) {

                        count++;
                        break;
                    }

                }
//            只有生成一个满足的数索引才会增加,否则不增加,继续生成随机数
                if (count == 0) {
                    arr[i] = randomNumber;
                    i++;
                }

            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }

}
