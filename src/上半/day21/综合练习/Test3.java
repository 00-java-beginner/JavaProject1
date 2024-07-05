package 上半.day21.综合练习;

public class Test3 {
    public static void main(String[] args) {
        //猴子吃桃
        System.out.println(getCount(2));
    }

    public static int getCount(int day) {
        //对异常情况先进行处理
        if (day <= 0 || day >= 11) {
            return -1;
        }
        //递归的出口
        //当日期为第十天的时候，表示只剩下了最后一个桃
        if (day == 10) {
            return 1;
        }
        //递归规律，每天吃的桃子等于后一天吃的+1再乘2
        return (getCount(day + 1) + 1) * 2;
    }
}
