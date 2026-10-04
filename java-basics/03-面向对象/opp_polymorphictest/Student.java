package opp_polymorphictest;

public class Student {
//    3.定义学生类
//属性:姓名,年龄


    private String name;
    private String age;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    //行为:使用图形,打印图形信息,并打印周长和面积
    //要求:
//学生使用图形的方法,既能使用长方形又能使用圆形
    public void useGraphics(Graphics graphics) {
//        判断student使用的图形是圆形还是长方形,并打印图形信息,并打印周长和面积
        if (graphics instanceof Rectangle) {
            Rectangle l = (Rectangle) graphics;
            System.out.println("长方形的宽为:" + l.getWidth() + "," + "高为:" + l.getHeight() + ","
                    + "周长为:" + l.getPerimeter() + ","
                    + "面积为:" + l.getArea());
        }else if(graphics instanceof Round){
            Round r = (Round) graphics;
            System.out.println("圆形的半径为:" + r.getRadius() + ","
                    + "周长为:" + r.getPerimeter() + ","
                    + "面积为:" + r.getArea());
        }
        else{
            System.out.println("学生使用的图形不是长方形也不是圆形");
        }
    }
}
