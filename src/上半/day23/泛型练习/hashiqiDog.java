package 上半.day23.泛型练习;

public class hashiqiDog extends Dog{
    public hashiqiDog() {
    }

    public hashiqiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做" + getName()+ "的"+getAge() + "岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
