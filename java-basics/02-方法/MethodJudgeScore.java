import java.util.Scanner;

public class MethodJudgeScore {
    /*跳水比赛有五个评委打分,分数在0~100之间。最终得分会去掉一个最高分,去掉一个最低分,
    剩余的分数再求平均数,改平均数为选手最终得分。

    要求1:利用键盘录入5个整数存入数组当中,如果分数超出范围需要重新录入

    要求2:定义方法分别求数组的最大值和最小值

    要求3:计算五名评委的总分

    要求4:总分-最大值-最小值,求选手最终平均分*/
    public static void main(String[] args) {
//        1.定义一个数组存储5个评委的分数
        Scanner sc = new Scanner(System.in);
        int [] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数:");
            scores[i] = sc.nextInt();
            if(!(scores[i] >= 0 && scores[i] <= 100)) {
                System.out.println("分数超出范围,请重新输入");
                i--;
            }
        }
//        2.调用方法求最大值和最小值
        int max = getMax(scores);
        int min = getMin(scores);
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);
//        3.计算总分
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("总分为:" + sum);
//        4.计算最终平均分
        double average = (double)(sum - max - min) / (scores.length - 2);
        System.out.println("最终平均分为:" + average);

    }
//    定义方法求最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
//    定义方法求最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
