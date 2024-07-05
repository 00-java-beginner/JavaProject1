package 上半.day15.p135_抽象类和抽象方法;

public class Forg extends Animal{
    public Forg() {
    }

    public Forg(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
