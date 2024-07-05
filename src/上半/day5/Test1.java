package 上半.day5;

public class Test1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int max = getmax(arr);

        System.out.println(max);
    }

    public static int getmax(int [] arr) {
        int max = arr[0];

        for (int i = 1;i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
