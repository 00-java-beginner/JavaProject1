package 上半.day18_day19.two_练习;

public class Test2 {
    public static void main(String[] args) {
        //统计3位数中有多少个水仙花
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i /100 % 10;

            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if (sum == i){
                count++;
            }
        }
        System.out.println(count);
    }
}
