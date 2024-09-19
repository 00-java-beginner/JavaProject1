package 下半.day26_Stream流和方法引用.方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        //创建集合添加学生对象
        //获取姓名放到数组中
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));

//        String[] arr = list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student s) {
//                return s.getName();
//            }
//        }).toArray(String[]::new);

        String[] arr2 = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
