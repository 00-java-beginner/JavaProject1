package 上半.day3;

public class 三元运算符 {
    public static void main(String[] args) {
        /* 格式：
             关系表达式？表达式1：表达式2
           范例：
             a > b ? a : b;
           计算规则：
             首先计算关系表达式的指
             如果值为true，表达式1的值就是运算结果
             如果值为false，表达式2的值就是运算结果
        */
        int a = 10;
        int b = 20;

        //获取两个数据中的较大值
        int max6 = a > b ? a : b;
        System.out.println("最大值为" + max6);


//  需求:动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg
//  请用程序实现判断两只老虎的体重是否相同。
        int weight1 = 180;
        int weight2 = 200;
//  可以使用三元运算符实现老虎体重的判断，体重相同，返回true，反之为false
        boolean c = weight1 == weight2 ? true : false;
        System.out.println("结果为" + c);


//  需求:一座寺庙里住着三个和尚，
//  已知他们的身高分别为150cm.210cm、165m，请用程序实现获取这三个和尚的最高身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
//  用三元运算符获取前两个中高的那个临时保存起来在跟另一个进行比较
        int max = height1 > height2 ? height1 : height2;
        int maxheight = max > height3 ? max : height3;
        System.out.println("最高的和尚为" + maxheight);

    }
}
