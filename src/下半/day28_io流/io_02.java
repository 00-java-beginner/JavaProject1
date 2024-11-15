package 下半.day28_io流;

import java.io.FileOutputStream;
import java.io.IOException;

public class io_02 {
    public static void main(String[] args) throws IOException {
        //02-04
        //字节输出流：FileOutputStream
        //实现：写出一段文字到本地文件中
        //实现步骤：1.创建对象  2.写出数据  3.释放资源
        //E:\JavaProject1\Myfile\aaa
        //1.创建对象  由于OutputStream是一个抽象类，所以不能直接创建他的对象  需要创建他的子类的对象
        /*
        细节1:参数是字符串表示的路径或者是File对象都是可以的
        细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
        细节3:如果文件已经存在，则会清空文件
        */
        FileOutputStream fos = new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt");

        //2.写出数据，一次写一个  细节:write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
        //fos.write(97);

        //一次写一个字节数组
        byte[] bytes = {97,98,99,100,101};
        //fos.write(bytes);

        //一次写一个字节数组的部分数据
        //参数一：数字  参数二：起始索引  参数三：个数
        fos.write(bytes,0,3);

        //3.释放资源  每次使用完流之后都要释放资源
        fos.close();
    }
}
