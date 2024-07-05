package 上半.day13.p132_多态综合练习;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Dog dog, String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"
                +dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
        dog.eat(something);

    }
    public void keepPet(Cat cat , String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"
                +cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
        cat.eat(something);
    }
    //想要一个方法，可以接受所有的动物
    //方法的行参：可以写这些的父类
    public void keepPet(Animal a,String something){
        //对传递过来的动物进行判断
        if (a instanceof Dog d){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"
                    +d.getColor()+"颜色的"+d.getAge()+"岁的狗");
            d.eat(something);
        }else if (a instanceof Cat c){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"
                    +c.getColor()+"颜色的"+c.getAge()+"岁的狗");
            c.eat(something);
        }else {
            System.out.println("没有这种动物");
        }
    }
}
