package 上半.day23.泛型练习;

public class bosiCat extends Cat{
    public bosiCat() {
    }

    public bosiCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做" + getName()+ "的"+getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
