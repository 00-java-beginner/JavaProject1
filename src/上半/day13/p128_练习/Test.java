package 上半.day13.p128_练习;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("001","zhangsan","讲师");
        System.out.println(l.getId() + "," + l.getName() + "," + l.getWork());

        Maintainer m = new Maintainer("002" , "lisi" , "维护专员");
        System.out.println(m.getId() + "," + m.getName() + "," + m.getWork());

        Tutor t = new Tutor("003" , "wangwu" , "助教");
        System.out.println(t.getId() + "," + t.getName() + "," + t.getWork());

        Buyer b = new Buyer("004","zhaoliu","采购专员");
        System.out.println(b.getId() + "," + b.getName() + "," + b.getWork());
    }
}

