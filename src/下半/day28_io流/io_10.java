package 下半.day28_io流;

import java.io.FileInputStream;
import java.io.IOException;

public class io_10 {
    public static void main(String[] args) throws IOException {
        //一次读取多个数据
        //1.创建对象
        FileInputStream fis = new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt");

        //2.读取数据
        //定义每次读取的个数
        //细节：由于read方法每次读取会覆盖上一次的值，
        //所以如果直接转换类型会导致当读取时存在读取数据个数小于数组长度时会出现没有将后续的值进行覆盖的情况
        //解决方法：在转换类型时加上索引和读取的长度
        byte[] bytes = new byte[2];
        int len1 = fis.read(bytes);
        String str1 = new String(bytes, 0, len1);
        System.out.println(len1);
        System.out.println(str1);

        int len2 = fis.read(bytes);
        String str2 = new String(bytes, 0, len2);
        System.out.println(len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        String str3 = new String(bytes, 0, len3);
        System.out.println(len3);
        System.out.println(str3);

        //3.释放资源
        fis.close();
    }
}
