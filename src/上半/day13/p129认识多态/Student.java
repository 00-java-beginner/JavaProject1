package 上半.day13.p129认识多态;

public class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生的信息为：" + getName() + "," + getAge());
    }
}
