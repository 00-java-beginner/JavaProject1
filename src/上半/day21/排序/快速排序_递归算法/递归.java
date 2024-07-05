package 上半.day21.排序.快速排序_递归算法;

public class 递归 {
    public static void main(String[] args) {
        //求1-100之间的和
        System.out.println(getSum(100));
        System.out.println(getJc(5));
    }
    public static int getSum(int number){
        //只有当符合条件的时候才会结束递归
        //只要不调用自身，就会结束递归
        if (number == 1){
            return 1;
        }
        //由于方法内调用了自身，所以触发了递归
        return number + getSum(number - 1);
    }
    public static int getJc(int number){
        if (number == 1){
            return 1;
        }
        return number * getJc(number - 1);
    }
}
