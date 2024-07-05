package 上半.day5;

public class 数组_01_02_概念和静态初始化_地址值和元素访问 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11, 12, 13, 14};

        //通过索引获取第一个元素
        int number = arr[0];
        System.out.println(number);

        //获取数组中索引为1的数字，并直接打印
        System.out.println(arr[1]);

        //将数据存储到数组当中，一旦覆盖原来的数据就不存在了
        arr[0] = 100;
        System.out.println(arr[0]);

        //字符串格式
        String[] arr1 = {"王五", "张三"};
        System.out.println(arr1);

        //小数格式
        double[] arr2 = {165.0, 166.5, 170.2};
        System.out.println(arr2);

    }
}
