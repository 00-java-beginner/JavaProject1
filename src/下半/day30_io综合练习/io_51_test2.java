package 下半.day30_io综合练习;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class io_51_test2 {
    public static void main(String[] args) throws IOException {
        //1.把文件中的所有学生信息读取到内存中
        //创建一个集合将读到的数据存到集合当中
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("dest\\aaa\\a.txt"));
        String line;
        while ((line = br.readLine()) != null){
            //根据-进行切割
            String[] arr = line.split("-");
            //将切割后的数据依次创建一个新的学生对象
            Student stu = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            //将创建好的学生对象添加到集合中
            list.add(stu);
        }
        br.close();

        //2.计算权重的总和
        //定义一个变量记录初始的权重值
        double weight = 0;
        for (Student stu : list) {
            //循环等到集合当中的每一个元素，在进行累加
            weight = weight + stu.getWeight();
        }

        //3.计算每个人的实际占比
        //创建一个数组将得到的数据存储起来
        double[] arr = new double[list.size()];
        //定义一个变量记录索引
        int index = 0;
        for (Student stu : list) {
            arr[index] = stu.getWeight() / weight;
            //每次循环添加后需要自增，否则索引永远是0
            index++;
        }

        //4.计算每一个人的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        //5.随机抽取0-1之间的数据
        double number = Math.random();

        //6.判断number在arr中的位置
        int result = -Arrays.binarySearch(arr,number) - 1;

        //7.获取随机的那个学生
        Student stu = list.get(result);

        //8.修改当前学生的权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);

        //9.写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("dest\\aaa\\a.txt"));
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();

    }
}
