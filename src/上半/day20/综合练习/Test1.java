package 上半.day20.综合练习;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*键盘录入一些1~100之间的整数，并添加到集合中直到集合中所有数据和超过200为止。*/
        //1.创建一个集合用来添加数据
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入1-100之间的整数");
            String numStr = sc.nextLine();
            //将键盘录入的内容转换成int类型进行计算
            int num = Integer.parseInt(numStr);
            //对异常清空进行判断
            if (num < 1 || num >100 ){
                System.out.println("输入的数字不合法，请重新输入");
                continue;
            }
            //将转换后的内容添加到集合中
            //list.add(Integer.valueOf(num));
            //高版本jdk触发了自动装箱，不需要转换类型
            list.add(num);
            //统计集合中的数据和
            int sum = getSum(list);
            //对sum进行判断
            if (sum > 200){
                break;
            }
        }
        System.out.println(list);
    }
    //对集合中的数据进行累加
    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            sum = sum + num;
        }
        return sum;
    }
}
