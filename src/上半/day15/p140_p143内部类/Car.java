package 上半.day15.p140_p143内部类;

public class Car {
    //需求:写一个Javabean类描述汽车。
    //属性:汽车的品牌,车龄,颜色,发动机的品牌,使用年限。
    //内部类的访问特点:
    //内部类可以直接访问外部类的成员,包括私有
    //外部类要访问内部类的成员,必须创建对象
    String carName;
    int carAge;
    String carColor;
    //外部类要访问内部类的成员,必须创建对象
    public void show(){
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine{
        String engineName;
        int engineAge;
        //内部类可以直接访问外部类的成员,包括私有
        public void show(){
            System.out.println(engineName);
        }
    }
}
