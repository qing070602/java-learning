package oppextendstest;

public class Test {
    static void main() {
/*现在有三个电子设备,请设计他们的继承结构
安卓手机:
属性:品牌,价格,
行为:打电话,发短信,nfc功能

苹果手机:
属性:品牌,价格
行为:打电话,发短信

笔记本电脑:
属性:品牌,价格
行为:编程
*/
//        手机类(品牌，价格，打电话，发短信)-安卓手机，苹果手机 智能设备类(品牌，价格)-手机类，电脑类
        Android a = new Android();
        a.brand = "小米";
        a.price = 2999;
        System.out.println("品牌:" + a.brand + " 价格:" + a.price);
        a.call();
        a.sendMessage();
        a.nfc();
        System.out.println("-------------------");
        IOS i = new IOS();
        i.brand = "苹果";
        i.price = 5999;
        System.out.println("品牌:" + i.brand + " 价格:" + i.price);
        i.call();
        i.sendMessage();
        System.out.println("-------------------");
        Laptap l = new Laptap();
        l.brand = "联想";
        l.price = 4999;
        System.out.println("品牌:" + l.brand + " 价格:" + l.price);
        l.coding();

    }
}
