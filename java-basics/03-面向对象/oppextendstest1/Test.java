package oppextendstest1;

public class Test {
//    带有继承结构的标准JavaBean类
//书写一个完整的继承体系,要求私有化成员变量、get/set方法、构造方法、其他的成员方法

//本科学生:
//属性:姓名、年龄、年级
//行为:吃饭、睡觉、学习(攻读学士学位)

//硕士研究生:
//属性:姓名、年龄、年级
//行为:吃饭、睡觉、学习(攻读硕士学位)

//专业课老师:
//属性:姓名、年龄、学科
//行为:吃饭、睡觉、教书(教专业课知识)

//通识课老师:
//属性:姓名、年龄
//行为:吃饭、睡觉、教书(教通识课知识)
//过了一段时间,硕士研究生住宿条件升级,在豪华版学生公寓睡觉
    public static void main(String[] args) {
//       学生类（姓名 年龄 年级 吃饭 睡觉 学习）：本科学生 硕士研究生（学习要重写）
//        老师类（姓名 年龄 吃饭 睡觉 教书）：专业课老师 通识课老师（教书要重写）
//        person类（姓名 年龄 吃饭 睡觉）
        MasterStudent mas = new MasterStudent("张三",25,"研究生");
        System.out.println("姓名:"+mas.getName()+" 年龄:"+mas.getAge()+" 年级:"+mas.getGrade());
        mas.eat();
        mas.sleep();
        mas.study();

        MajorTeacher maj= new MajorTeacher("李四",40,"数学");
        System.out.println("姓名:"+maj.getName()+" 年龄:"+maj.getAge()+" 学科:"+maj.getSubject());
        maj.eat();
        maj.sleep();
        maj.teach();

    }
}
