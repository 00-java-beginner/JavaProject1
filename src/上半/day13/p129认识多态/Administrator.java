package 上半.day13.p129认识多态;

public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员的信息为：" + getName() + "," + getAge());
    }

}
