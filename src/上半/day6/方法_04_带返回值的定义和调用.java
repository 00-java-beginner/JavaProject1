package 上半.day6;

public class 方法_04_带返回值的定义和调用 {
    /*
    public static void main(String[] args) {
        //带返回值的方法调用的方式有三种
        //1.直接调用：方法名();
        //2.赋值调用：变量类型 变量 = 方法名();
        //3.输出调用：System.out.println(方法名());
        System.out.println(getsum(1,2,3));
    }
    public static int getsum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }

     */
    public static void main(String[] args) {
        double area1 = getArea(1.3, 2.6);
        double area2 = getArea(5.5, 6.6);
        if (area1 > area2) {
            System.out.println("第一个面积大");
        } else {
            System.out.println("第二个面积大");
        }
    }

    public static double getArea(double len, double width) {
        double area = len * width;
        return area;
    }
}
