package 下半.day26_Stream流和方法引用.方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        //收集集合中的数据添加到数组当中，并转换成对象
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三,23","李四,24","王五,25");
        List<Student> list2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(list2);

        Student[] list3 = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(list3));
    }
}
