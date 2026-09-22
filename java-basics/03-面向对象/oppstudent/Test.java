package oppstudent;

public class Test {
    public static void main(String[] args) {
//
//
//定义一个Javabean类描述学生:
//属性:姓名 年龄
//行为:学习,吃饭,睡觉
//
//
//  创建对象
        Student stu1 = new Student();
         stu1.setName("张三");
         stu1.setAge(20);
        System.out.println(stu1.getAge());
        System.out.println(stu1.getName());
        stu1.learn();
        stu1.eat();
        stu1.sleep();

        Student stu2 = new Student("李四", 22);
        System.out.println(stu2.getAge());
        System.out.println(stu2.getName());
        stu2.learn();
        stu2.eat();
        stu2.sleep();

    }
}
