package 上半.day15.p136_接口;

public class Dog extends Animal implements Swim {
    public Dog() {
    }
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }
}
