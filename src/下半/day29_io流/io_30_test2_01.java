package 下半.day29_io流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class io_30_test2_01 {
    public static void main(String[] args) throws IOException {
        //将csb.txt中的内容进行排序
        //1.创建对象
        BufferedReader br = new BufferedReader(new FileReader("E:\\JavaProject1\\Myfile\\aaa\\csb.txt"));


        //2.得到文本中的内容
        String Line;
        ArrayList<String> list = new ArrayList<>();
        while ((Line = br.readLine()) != null) {
            //这里需要将得到的数据放到一个容器中，所以需要创建一个集合
            list.add(Line);
        }

        //3.释放资源
        br.close();

        //4.排序
        //由于这里sort方法的排序规则不满足当前需求，所以需要自己重写规则
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1.split("\\.")[0]：调用split方法对.进行切割，然后获取到0索引上的数值
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                //将两个结果进行计算排序
                return i1 - i2;
            }
        });
        
        //5.写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\JavaProject1\\Myfile\\aaa\\recsb.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
