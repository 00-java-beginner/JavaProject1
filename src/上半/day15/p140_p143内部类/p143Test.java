package 上半.day15.p140_p143内部类;

public class p143Test {
    public static void main(String[] args) {
        //new 类名或接口名(){
        // 重写方法
        // }

        //编写匿名内部类的代码
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

    }
}
