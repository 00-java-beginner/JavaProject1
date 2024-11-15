package 下半.day28_io流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class io_24_test3_2 {
    public static void main(String[] args) throws IOException {
        //1.读取数据
        FileReader fr = new FileReader("E:\\JavaProject1\\Myfile\\aaa\\a.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            //利用append方法将得到的数据转换成char类型并添加到sb当中，如果不转换得到的结果是字节数据而不是字符数据
            sb.append((char) ch);
        }
        fr.close();

        //2.利用stream流进行切割
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                //利用方法引用进行数据类型的转换
                .map(Integer::parseInt)
                //排序
                .sorted()
                //将排序后的数据重新收集起来
                .toArray(Integer[]::new);//利用方法引用表示创建了一个Integer类型的数组

        //3.写出
        FileWriter fw = new FileWriter("E:\\JavaProject1\\Myfile\\aaa\\a.txt");
        //将数组当中的, 进行替换
        String s = Arrays.toString(arr).replace(", ", "-");
        //将数组的左括号和右括号根据索引进行截取
        String result = s.substring(1, s.length() - 1);
        fw.write(result);
        fw.close();
    }
}
