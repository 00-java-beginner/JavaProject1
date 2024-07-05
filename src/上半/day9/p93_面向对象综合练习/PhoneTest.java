package 上半.day9.p93_面向对象综合练习;

public class PhoneTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Phone[] arr = new Phone[3];

        //2.创建对象
        Phone p1 = new Phone("小米",1999,"白色");
        Phone p2 = new Phone("华为",4999,"红色");
        Phone p3 = new Phone("荣耀",3999,"蓝色");

        //3.赋值
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4.获取价格
        //定义一个变量接受数组中的价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //将循环得到的元素赋值给一个新的变量
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        //5.计算平均价格
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
