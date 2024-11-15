package 下半.day29_io流;

import java.io.Serial;
import java.io.Serializable;

/*
    Serializable接口里面是没有抽象方法，标记型接口
    一旦实现了这个接口，那么就表示当前的student类可以被序列化
    理解:
        个物品的合格证
* */
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 8933766919083022724L;
    private int age;
    private String name;

    //transient:瞬态关键字
    //作用:不会把当前属性序列化到本地文件当中
    private transient String address;


    public Student() {
    }

    public Student(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{age = " + age + ", name = " + name + ", address = " + address + "}";
    }
}
