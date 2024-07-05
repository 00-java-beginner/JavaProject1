package 上半.day13.p129认识多态;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("赵四");
        t.setAge(40);

        Administrator admin = new Administrator();
        admin.setName("宿管大叔");
        admin.setAge(50);

        register(s);
        register(t);
        register(admin);
    }
    public static void register(Person p){
        p.show();
    }
}
