package 上半.day20.综合练习;

public class Test3 {
    public static void main(String[] args) {
        /*定义一个方法自己实现toBinarystring方法的效果，将一个十进制整数转成字符串表示的二进制。*/
        System.out.println(toBinarystring(6));
        System.out.println(Integer.toBinaryString(6));

    }
    public static String toBinarystring(int number){
        StringBuilder sb = new StringBuilder();
        //利用循环不断除以2
        while (true){
            if (number == 0){
                break;
            }
            //获取余数
            int remaindar = number % 2;
            //倒着拼接
            sb.insert(0,remaindar);
            //除以2
            number = number / 2;
        }
        return sb.toString();
    }
}
