package opp_polymorphictest;

public class Test {
    /*1.定义长方形类
属性:宽、高
行为:计算周长,计算面积

//2.定义圆形类
//属性:圆周率,半径
//行为:计算周长,计算面积

3.定义学生类
属性:姓名,年龄
行为:使用图形,打印图形信息,并打印周长和面积
要求:
学生使用图形的方法,既能使用长方形又能使用圆形*/

    public static void main(String[] args) {
//创建学生对象
        Student stu = new Student("张三", "20");
//创建长方形对象
        Rectangle rec = new Rectangle(5, 10);
//        使用长方形
stu.useGraphics(rec);
//创建圆形对象
        Round round = new Round(5);
//        使用圆形
        stu.useGraphics(round);
    }
}
