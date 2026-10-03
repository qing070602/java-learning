package oppextendstest1;

public class BachelorStudent extends Student{
    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
    //    重写学习方法

    @Override
    public void study() {
        System.out.println("攻读学士学位");
    }
}
