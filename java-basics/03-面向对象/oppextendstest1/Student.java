package oppextendstest1;

public class Student extends Person {
//     学生类（姓名 年龄 年级 吃饭 睡觉 学习）
    //      person类（姓名 年龄 吃饭 睡觉）
    private String grade;
//    构造方法
//    空参构造和带全部参数的构造（父+子）

    public Student() {
    }
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
//    get和set方法

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
//    行为：学习
    public void study() {
        System.out.println("学习");
    }
}
