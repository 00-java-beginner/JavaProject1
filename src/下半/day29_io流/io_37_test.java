package 下半.day29_io流;

import java.io.*;
import java.util.ArrayList;

public class io_37_test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //需求：将多个自定义对象序列化到文件中，但是由于对象的个数不确定，反列化流该如何读取呢?
        //1.创建对象
        Student s1 = new Student(23,"zhangsan","深圳");
        Student s2 = new Student(24,"lisi","广州");
        Student s3 = new Student(25,"wangwu","东莞");

        //2.创建集合将对象添加到集合当中（方便后续读出数据）
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        //3.创建序列化流的对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\c.txt"));

        //4.写入数据
        oos.writeObject(list1);

        //5.创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\c.txt"));

        //6.读取数据
        ArrayList<Student> list2 = (ArrayList<Student>) ois.readObject();
        for (Student student : list2) {
            System.out.println(student);
        }

        //7.释放资源
        ois.close();
        oos.close();
    }
}
