package 上半.day20.综合练习;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //jdk7,判断平年或闰年
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);//月份的范围0-11
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        if (day1 == 29){
            System.out.println("是闰年");
        }else {
            System.out.println("是平年");
        }

        //jdk8
        LocalDate ld1 = LocalDate.of(2000,3,1);
        LocalDate ld2 = ld1.minusDays(1);
        int day2 = ld2.getDayOfMonth();
        if (day2 == 29){
            System.out.println("是闰年");
        }else {
            System.out.println("是平年");
        }
        //直接可以判断平闰年
        System.out.println(ld1.isLeapYear());

    }
}
