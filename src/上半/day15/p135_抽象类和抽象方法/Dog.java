package 上半.day15.p135_抽象类和抽象方法;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
}
