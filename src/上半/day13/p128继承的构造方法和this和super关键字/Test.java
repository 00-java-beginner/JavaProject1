package 上半.day13.p128继承的构造方法和this和super关键字;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001" , "张三" , 15000 , 8000);
        System.out.println(m.getId() + m.getName() + m.getSalary() + m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook("002" , "李四" , 15000);
        System.out.println(c.getId() + c.getName() + c.getSalary());
        c.work();
        c.eat();
    }
}
