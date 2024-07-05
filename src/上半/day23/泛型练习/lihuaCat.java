package 上半.day23.泛型练习;

public class lihuaCat extends Cat{
    public lihuaCat() {
    }

    public lihuaCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做" + getName()+ "的"+getAge() + "岁的狸花猫，正在吃鱼");
    }
}