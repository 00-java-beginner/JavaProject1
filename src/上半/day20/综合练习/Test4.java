package 上半.day20.综合练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //1.用jdk7计算出生到现在一共多少天
        String birthday = "2000年6月30日";
        //解析字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //获取毫秒值
        Date data = sdf.parse(birthday);
        //将获取到的毫秒值赋值给基本数据类型
        long birthdayTime = data.getTime();
        //获取当前时间的毫秒值
        long todayTime = System.currentTimeMillis();
        //求出两个毫秒值的差值
        long time = todayTime - birthdayTime;
        System.out.println(time / 3600 / 24 / 1000);

        //2.jdk8
        LocalDate ld1 = LocalDate.of(2000,6,30);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }
}
