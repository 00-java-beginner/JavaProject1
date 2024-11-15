package 下半.day29_io流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class io_35 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //需求：利用反序列化流/对象操作输入流，把本地文件中的对象读取出来
        //1.创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\csb.txt"));

        //2.读取数据
        Object object = ois.readObject();
        System.out.println(object);

        //3.释放资源
        ois.close();
    }
}
