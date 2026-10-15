package loop;

public class AttackCount {
    public static void main(String[] args) {
        //    对方血量
        int blood = 2025;
//
//        攻击回合
        int n = 0;
//        三个英雄的攻击伤害
        int a = 5;
        int b = 0;
        int c = 0;
        while (blood > 0) {
            n++;
            blood -= a;
            if (n % 2 == 0) {
                b = 15;
                blood -= b;
            } else {
                b = 2;
                blood -= b;
            }
            if (n % 3 == 1) {
                c = 2;
                blood -= c;
            } else if (n % 3 == 2) {
                c = 10;
                blood -= c;
            }else if(n % 3 == 0){
                c = 7;
                blood -= c;
            }else{
                c = 0;
            }
            System.out.println("第" + n + "回合攻击伤害为：" + a + "+" + b + "+" + c + "=" + (a + b + c) + "，剩余血量为：" + blood);
        }
        System.out.println("击败对方需要的回合数为：" + n);
    }
}
