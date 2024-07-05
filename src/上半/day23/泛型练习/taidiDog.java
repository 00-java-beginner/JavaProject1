package 上半.day23.泛型练习;

public class taidiDog extends Dog{
    public taidiDog() {
    }

    public taidiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
