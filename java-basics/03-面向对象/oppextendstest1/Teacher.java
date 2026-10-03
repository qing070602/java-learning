package oppextendstest1;

public class Teacher extends Person {
//     老师类（姓名 年龄 学科 吃饭 睡觉 教书）
//     person类（姓名 年龄 吃饭 睡觉）
    private String subject;
//    构造方法
//    空参构造和带全部参数的构造（父+子）

    public Teacher() {
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
//    get和set方法

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println("教书");
    }
}
