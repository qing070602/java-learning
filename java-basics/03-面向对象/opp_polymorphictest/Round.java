package opp_polymorphictest;

public class Round extends Graphics {
//    2.定义圆形类
//属性:圆周率,半径
//行为:计算周长,计算面积
    final double PI = 3.14;
    private double radius;

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
//    重写

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
