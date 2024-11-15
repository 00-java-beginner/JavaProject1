package 下半.day27_异常_file_综合练习.异常;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        * 需求:
        键盘录入自己心仪的女朋友姓名和年龄。
        姓名的长度在3-10之间
        年龄的范围为 18-40岁
        超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止。
        *
        * 提示:
        需要考虑用户在键盘录入时的所有情况，
        比如:录入年龄时超出范围，录入年龄时录入了abc等情况
        * */
        //1.键盘录入
        Scanner sc = new Scanner(System.in);

        //2.创建对象
        GirlFriend gf = new GirlFriend();

        while (true) {
            try {
                //3.接收姓名
                System.out.println("请输入姓名");
                String name = sc.nextLine();
                gf.setName(name);

                //4.接收年龄
                System.out.println("请输入年龄");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                break;
            } catch (NumberFormatException | NameFormatException | AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        System.out.println(gf);

    }
}
