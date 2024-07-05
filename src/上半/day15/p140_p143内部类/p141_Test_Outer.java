package 上半.day15.p140_p143内部类;

public class p141_Test_Outer {
    private int a = 10;
    class Inner{
        private int a = 20;
        public void show(){
            int a = 30;
            /*由于是oi调用的show方法，首先会先从方法内部找局部变量
            直接输出a会触发就近原则，直接在本类中寻找变量a//30
            其次用this调用a，会触发调用者的地址值，当前方法的调用者是内部类对象
            所以直接打印内部类对象的a//20
            最后由于利用外部类对象调用this关键字，会从外部类对象的地址值中找
            所以打印的是外部类对象的a//10
            调用外部类对象，利用this调用实例变量的方式*/
            System.out.println(p141_Test_Outer.this.a);//10

            System.out.println(this.a);//20

            System.out.println(a);//30
        }
    }
}
