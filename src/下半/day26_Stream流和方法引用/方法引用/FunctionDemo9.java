package 下半.day26_Stream流和方法引用.方法引用;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FunctionDemo9 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        *   需求：
        *       创建集合添加学生对象
        *       学生对象属性：name，age
        *   要求：
        *       把姓名和年龄拼接成：张三-23的字符串，并放到数组当中
        *       使用方法引用完成
        * */

       /* ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("zhangsan",23));
        list2.add(new Student("lisi",24));
        list2.add(new Student("wangwu",25));*/

        File f = new File("C:\\Users\\alienware\\Desktop\\a.txt");
        FileInputStream fis = new FileInputStream(f);

    }
}
