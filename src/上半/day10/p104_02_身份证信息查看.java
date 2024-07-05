package 上半.day10;

public class p104_02_身份证信息查看 {
    public static void main(String[] args) {
        //1.定义一个变量记录身份证
        String id = "522424199507219819";
        //2.截取身份证的7-14位
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        //3.截取身份证的17位
        char gender = id.charAt(16);
        int num = gender - 48;
        if (num % 2 == 0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }



    }
}
