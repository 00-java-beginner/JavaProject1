package 上半.day13.p129认识多态;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师的信息为：" + getName() + "," + getAge());
    }
}
