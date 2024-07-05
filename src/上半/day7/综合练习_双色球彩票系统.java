package 上半.day7;

import java.util.Random;
import java.util.Scanner;

public class 综合练习_双色球彩票系统 {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr = createNumber();

        //2.用户输入彩票号码
        int[] userInputArr = userInputNumber();
        //3.判断用户的中奖情况
        int redConut = 0;
        int blueConut = 0;
        //4.判断红球的中奖情况
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == redNumber) {
                    redConut++;
                    //如果找到了用户输入的红球号码在中奖的数组中则结束内循环，继续外循环判断下一个
                    break;
                }
            }
        }
        //5.判断蓝球的中奖情况
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueConut++;
        }
        //6.根据红球和蓝球的个数判断中奖情况
        if (redConut == 6 && blueConut == 1) {
            System.out.println("中奖1000万");
        } else if (redConut == 6 && blueConut == 0) {
            System.out.println("中奖500万");
        } else if (redConut == 5 && blueConut == 1) {
            System.out.println("中奖300万");
        } else if ((redConut == 5 && blueConut == 0) || (redConut == 4 && blueConut == 1)) {
            System.out.println("中奖100万");
        } else if ((redConut == 4 && blueConut == 0) ||
                (redConut == 3 && blueConut == 1) || (redConut == 2 && blueConut == 1)) {
            System.out.println("中奖50万");
        } else if ((redConut == 1 && blueConut == 1) || (redConut == 0 && blueConut == 1)) {
            System.out.println("中奖10万");
        } else {
            System.out.println("没有中奖，谢谢参与");
        }
    }

    public static int[] userInputNumber() {
        //1.创建数组存储用户购买的彩票号码
        int arr[] = new int[7];
        //2.键盘录入让用户输入
        Scanner sc = new Scanner(System.in);
        //3.让用户输入红球号码,（红球号码不能超出范围并且具有唯一性）
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                //表示在范围内允许录入
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    //表示当前录入的号码不存在，添加进数组
                    arr[i] = redNumber;
                    //成功添加后索引才能自增
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在，请重新输入");
                }
            } else {
                System.out.println("当前录入的红球号码超出了范围");
            }
        }
        //4.让用户输入蓝球号码
        System.out.println("请输入蓝球号码");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                //只有输入正确范围的号码才会结束循环
                break;
            } else {
                System.out.println("当前录入的蓝球号码超出了范围");
            }
        }
        //5.返回数组
        return arr;
    }

    public static int[] createNumber() {
        //1.创建数组用于添加中奖号码,六个红球，一个蓝球
        int[] arr = new int[7];
        //2.随机生成号码并添加到数组当中，红球不能重复，蓝球可以重复
        Random r = new Random();
        //生成红球号码并添加到数组当中
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;//范围是1-33
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                //只有添加成功后索引才会自增
                i++;
            }
        }
        //生成蓝球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;//范围是1-16
        arr[arr.length - 1] = blueNumber;
        //生成完成后返回数组
        return arr;
    }

    public static boolean contains(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
