package 上半.day4;

import java.util.Scanner;

public class 循环和判断_05_switch {
    public static void main(String[] args) {

/*     首先计算表达式的值，依次和case后面的值进行比较，如果有对应的值，就会执行相应的语句，在执行的过程中 ，遇到break就结束。
       如果所有的case后面的值和表达式的值都不匹配，就会执行default里面的语句体，然后结束整个switch语句
       格式说明：
              表达式：取值为：byte，short，int，char，枚举，string
              case：
                  1.后面跟的是要跟表达式进行比较的值
                  2.后面的值只能是字面量，不能是变量
                  3.给出的值不允许重复
       switch (表达式){
           case 值1:
                语句体1;
                break;
           case 值2:
                语句体2;
                break;
           default:
                语句体n+1;
                break;
        }
*/
        //1.定义变量记录想吃的面
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你想吃的面");
        String noodles = sc.next();

        //2.用这个变量跟switch进行匹配
        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "红烧牛肉面":
                System.out.println("吃红烧牛肉面");
                break;
            case "老坛酸菜面":
                System.out.println("吃老坛酸菜面");
                break;
            default:
                System.out.println("吃香辣牛肉面");
                break;
        }

        //1.键盘录入今天星期几
        Scanner sc1 = new Scanner(System.in);
        System.out.println("输入今天星期几");
        int week = sc1.nextInt();

        //2.利用switch对星期进行匹配
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入正确的星期");
                break;

        }
    }
}
