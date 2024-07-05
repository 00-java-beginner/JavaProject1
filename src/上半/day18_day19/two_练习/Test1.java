package 上半.day18_day19.two_练习;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(isPrime(997));
    }
    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
