public class MethodSum {

    /*练习:定义一个方法,求两个数的和

定义格式:
public static 返回值类型 方法名(参数1,参数2 ... ){
方法体;
return 返回值;
}

调用格式:
方法名(参数1,参数2 ... );

注意点:

1. 方法跟方法之间是平级关系,不能互相嵌套
2. 方法不会主动运行的,需要被调用才可以
3. 小括号中的参数需要一一对应(个数,类型)*/
    public static void main(String[] args) {

        int sum = getsum(10,20);
        System.out.println(sum);
        System.out.println(getsum(100,200));
    }
    //定义方法,求两个数的和
    public static int getsum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
