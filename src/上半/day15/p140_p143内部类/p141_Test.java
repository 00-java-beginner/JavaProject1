package 上半.day15.p140_p143内部类;

public class p141_Test {
    public static void main(String[] args) {
        //创建内部类对象，调用show方法
        p141_Test_Outer.Inner oi = new p141_Test_Outer().new Inner();

        oi.show();
    }
}
