package 下半.day29_io流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class io_34 {
    public static void main(String[] args) throws IOException {
        //需求：利用序列化流/对象操作输出流，把一个对象写到本地文件中
        //1.创建学生对象
        Student stu = new Student(23,"zhangsan","浙江");

        //2.创建序列流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\csb.txt"));

        //3.写出数据
        oos.writeObject(stu);

        //4.释放资源
        oos.close();
    }
}
