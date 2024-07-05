package 上半.day5;

public class 循环高级综合练习_01_无限循环和跳转控制语句 {
    public static void main(String[] args) {
        //for格式的无限格式
        /*for(;;){
            System.out.println("学习");
        }*/

        //while格式的无限循环
        /*while (true){
            System.out.println("学习");
        }*/

        //需求：老虎吃包子，第三个有毒，跳过
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //结束本次循环，继续下次循环
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }

        //需求：老虎吃包子，吃完第三个吃饱了
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3) {
                //结束整个循环
                break;
            }
        }

    }
}
