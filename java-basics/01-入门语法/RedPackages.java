import java.util.Random;

public class RedPackages {
    public static void main(String[] args) {
//        红包问题
//
//                给你两个整数M和N,M表示红包的总额,N表示红包的个数
//        现在又N个人来抽红包,每个人都是随机的,打印每个人领的红包金额
//
//        注1:每个人最少1分钱
//
//        注2:每个人领完红包之后,至少预留1*N分钱
//
//        注3:最后一个人是拿剩余的总额

//        1.定义红包总额和红包个数
        int M = 100;
        int N = 5;
//        2.定义一个数组存储每个人领的红包金额
        int[] redPackages = new int[N];
        Random r = new Random();
////        3.循环遍历每个人领红包
//        for (int i = 0; i < N; i++) {
////            随机生成红包金额,范围是1~M-已经领取的红包金额
//            redPackages[i] = r.nextInt(1,M - redPackages[i]);（redPackages[i]不能放在这里）
////            更新剩余红包金额
//            M = M - redPackages[i];（这里M会一直减少）
////            如果当前人领的红包金额大于当前金额减去剩余人数的保底金额，则重新生成
//            if(redPackages[i] > M - N){
//                i--;
//            }
//            if(i == N - 1){
//                redPackages[i] = M;
//        }
//    }
////        4.输出每个人领的红包金额
//        System.out.print("每个人领的红包金额为:[");
//        for (int i = 0; i < redPackages.length; i++) {
//            if(i != redPackages.length - 1){
//                System.out.print(redPackages[i] + ",");
//            } else {
//                System.out.print(redPackages[i]);
//            }
//        }
//        System.out.println("]");

//        修正版本
        if (N <= 0) {
            System.out.println("红包个数必须大于0");
            return;
        }
        if (M < N) {
            System.out.println("红包总额不能小于红包个数");
            return;
        }
        for (int i = 0; i < N - 1; i++) {
//            之后有多少人领红包
            int remainingPeople = N - i - 1;
//            计算当前人最多能领的红包金额
            int maxAmount = M - remainingPeople;
//            随机生成红包金额,范围是1~maxAmount
            redPackages[i] = r.nextInt(1, maxAmount + 1);
//            更新剩余红包金额
            M -= redPackages[i];
        }
        // 最后一个人领剩下的所有红包
        redPackages[N - 1] = M;
        // 输出每个人领的红包金额
        System.out.print("每个人领的红包金额为:[");
        for (int i = 0; i < redPackages.length; i++) {
            if(i != redPackages.length - 1){
                System.out.print(redPackages[i] + ",");
            } else {
                System.out.print(redPackages[i]);
            }
        }
        System.out.println("]");

    }
}
