package 上半.day21.综合练习;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend("xiaohong",22,165.3);
        GirlFriend gf2 = new GirlFriend("xiaobai",20,150.2);
        GirlFriend gf3 = new GirlFriend("xiaolan",24,175.6);

        GirlFriend [] arr = {gf1,gf2,gf3};
        //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        Arrays.sort(arr, (o1, o2) -> {
            //1.定义一个变量，记录相减后年龄的值，用于后续判断
            double temp = o1.getAge() - o2.getAge();
            //如果temp的值不等于0才执行?后面的内容，表示如果身高相减后不等于0，那么temp维持不变
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if (temp > 0){
                return 1;
            }else if (temp < 0){
                return -1;
            }else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
