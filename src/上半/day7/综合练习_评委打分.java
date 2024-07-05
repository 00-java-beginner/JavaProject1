package 上半.day7;

import java.util.Scanner;

public class 综合练习_评委打分 {
    public static void main(String[] args) {
        //需求：在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
        //选手的最后得分为:去掉最5高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        //1.定义一个数组记录六个分数，范围是0-100
        int[] scoresarr = getscores();
        for (int i = 0; i < scoresarr.length; i++) {
            System.out.println(scoresarr[i]);
        }
        //2.求最大值
        int max = getMax(scoresarr);
        //3.求最小值
        int min = getMin(scoresarr);
        //4.求数组的总和
        int sum = getSum(scoresarr);
        //5.求平均分
        int avg = (sum - max - min) / (scoresarr.length - 2);
        System.out.println(avg);
    }

    //1.定义数组
    public static int[] getscores() {
        int[] scores = new int[6];
        //通过键盘录入的形式，输入0-100
        Scanner sc = new Scanner(System.in);
        //通过循环将键盘录入的数据赋值给数组scores
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入你的评分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                //将循环控制i++放在条件判断内防止超出返回后继续循环
                i++;
            }
        }
        return scores;
    }

    //2.求最大值
    public static int getMax(int[] scoresarr) {
        int max = scoresarr[0];
        for (int i = 0; i < scoresarr.length; i++) {
            if (scoresarr[i] > max) {
                max = scoresarr[i];
            }
        }
        return max;

    }

    //3.求最小值
    public static int getMin(int[] scoresarr) {
        int min = scoresarr[0];
        for (int i = 0; i < scoresarr.length; i++) {
            if (scoresarr[i] < min) {
                min = scoresarr[i];
            }
        }
        return min;
    }

    //4.求数组的总和
    public static int getSum(int[] scoresarr) {
        int sum = 0;
        for (int i = 0; i < scoresarr.length; i++) {
            sum = sum + scoresarr[i];
        }
        return sum;
    }
}
