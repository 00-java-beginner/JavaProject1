package 上半.day13.p128继承的构造方法和this和super关键字;

public class Cook extends Employee {
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
