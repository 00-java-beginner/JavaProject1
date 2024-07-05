package 上半.day9.p93_面向对象综合练习;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*定义数组存储4个女朋友的对象
        女朋友的属性:姓名、年龄、性别、爱好
        要求1:计算出四女朋友的平均年龄
        要求2:统计年龄比平均值低的女朋友有几个?并把她们的,所有信息打印出来。*/
        //1.定义数组存储对象
        GirlFriend[] arr = new GirlFriend[4];
        //2.创建对象
        GirlFriend gf1 = new GirlFriend("小美", 18, "女", "吃东西");
        GirlFriend gf2 = new GirlFriend("小王", 20, "女", "买东西");
        GirlFriend gf3 = new GirlFriend("小红", 22, "女", "逛街");
        GirlFriend gf4 = new GirlFriend("小赵", 24, "女", "上班");
        //3.将对象添加到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        //4.计算出平均年龄
        //求和
        int sum = 0;
        for (GirlFriend gf : arr) {
            sum = sum + gf.getAge();
        }
        int avg = sum / arr.length;
        System.out.println(avg);

        //5.统计年龄比平均值低的有几个
        int count = 0;
        for (GirlFriend gf : arr) {
            int age = gf.getAge();
            if (avg < age) {
                count++;
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
            }
        }
        System.out.println(count);
    }
}
