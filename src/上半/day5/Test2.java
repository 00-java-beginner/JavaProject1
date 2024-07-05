package 上半.day5;

public class Test2 {
    public static void main(String[] args) {
        int arr [] = {1,5,32,65,678,35};

        boolean flag = contains(arr , 1);

        System.out.println(flag);
    }



    public static boolean contains(int [] arr,int number ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }

}
