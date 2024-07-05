package 上半.day9.p92_对象数组的练习;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1.创建数组
        Car[] arr = new Car[3];
        //2.创建对象,数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //注意事项：创建对象如果放在循环外面，最后数组的值会变成最后一次输入的值
            //因为每次循环后没有创建新的对象，只是将用来数组中的参数进行了修改
            //所以需要将创建对象放在循环里面，这样每次i++的时候都会创建一个新的对象
            Car c = new Car();
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            //3.将数据赋值给数组
            arr[i] = c;
        }
        for (Car car : arr) {
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }

    }
}
