package 上半.day15.p138_接口和抽象类综合练习;
//不允许外界创建人的对象，因为此时创建人的对象是没有意义的。
public abstract class Person {
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
}