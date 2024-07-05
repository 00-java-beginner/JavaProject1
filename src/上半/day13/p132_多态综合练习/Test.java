package 上半.day13.p132_多态综合练习;

public class Test {
    public static void main(String[] args) {
//        Person p = new Person(25,"linjian");
//        Cat c = new Cat(2,"白");
//        p.keepPet(c,"猫粮");
//
//        Person p1 = new Person(27,"jiajian");
//        Dog d = new Dog(2,"白");
//        p1.keepPet(d,"骨头");

        Person p2 = new Person(22,"zhangsan");
        Dog d1 = new Dog(2,"黑");
        Cat c1 = new Cat(2,"灰");
        p2.keepPet(d1,"骨头");
        p2.keepPet(c1,"猫粮");
    }
}
