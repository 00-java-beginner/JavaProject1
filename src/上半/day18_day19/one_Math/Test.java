package 上半.day18_day19.one_Math;

public class Test {
    public static void main(String[] args) {
        //1.abs:获取参数绝对值
        System.out.println(Math.abs(-88));
        //1.1由于abs传递-2147483648会有bug，所以可以用absExact抛出异常
        //System.out.println(Math.absExact(-2147483648));

        //2.ceil:进一法，往竖轴的正方向进一
        System.out.println(Math.ceil(12.5));
        System.out.println(Math.ceil(-12.5));

        //3.floor:去尾法
        System.out.println(Math.floor(12.5));
        System.out.println(Math.floor(-12.5));

        //4.round:四舍五入
        System.out.println(Math.round(12.4));
        System.out.println(Math.round(-12.6));

        //5.max:获取两个整数较大值
        System.out.println(Math.max(1,2));

        //6.min:获取两个整数较大值
        System.out.println(Math.min(1,2));

        //7.pow:获取a的b次幂
        System.out.println(Math.pow(8, 2));

        //8.sqrt:开平方
        System.out.println(Math.sqrt(4));

        //9.cbrt:开立方
        System.out.println(Math.cbrt(8));

        //10.random:随机数（范围0-1）
        //获取十个1-100之间的随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random()*100)+1);
        }

    }
}
