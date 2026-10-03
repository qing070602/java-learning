package oppextendstest1;

public class MasterStudent extends Student{
    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
    //    重写学习方法

    @Override
    public void study() {
        System.out.println("攻读硕士学位");
    }

    @Override
    public void sleep() {
        System.out.println("过了一段时间,硕士研究生住宿条件升级,在豪华版学生公寓睡觉");
    }
}
