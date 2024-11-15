package 下半.day28_io流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class io_24_test3_1 {
    public static void main(String[] args) throws IOException {
        //修改文件中的数据
        //1.读取数据
        FileReader fr = new FileReader("E:\\JavaProject1\\Myfile\\aaa\\a.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            //利用append方法将得到的数据转换成char类型并添加到sb当中，如果不转换得到的结果是字节数据而不是字符数据
            sb.append((char) ch);
        }
        fr.close();

        //2.切割
        String str = sb.toString(); //先将数据类型转换成字符串，否则无法调用切割方法
        String[] arrStr = str.split("-"); //根据-进行切割

        //3.转换数据类型，并存储到数组当中
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
            //利用parseInt方法将遍历到的每个元素转换成int类型
            int i = Integer.parseInt(s);
            //再将转换后的元素添加到数组当中
            list.add(i);
        }
        //4.排序
        Collections.sort(list);
        //5.写出
        FileWriter fw = new FileWriter("E:\\JavaProject1\\Myfile\\aaa\\a.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                //由于write在底层写入时如果是int类型的会默认根据整数所对应的ascii码表进行匹配，所以需要加上一个""表示这是一个字符串，这样直接写入就没问题了
                fw.write(list.get(i) + "");
            } else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();
    }
}
