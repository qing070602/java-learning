package oppextendstest1;

public class MajorTeacher extends Teacher {
    public MajorTeacher() {
    }

    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }
    //    重写教书方法

    @Override
    public void teach() {
        System.out.println("教专业课知识");
    }
}
