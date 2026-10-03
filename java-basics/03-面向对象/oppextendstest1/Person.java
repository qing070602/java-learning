package oppextendstest1;

public class Person {
//      person类（姓名 年龄 吃饭 睡觉）
    private String name;
    private int age;
//    构造方法
//    空参构造和带全部参数的构造

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    get和set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    行为:吃饭、睡觉
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
