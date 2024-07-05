package 上半.day23.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        boolean r1 = s.add("张三");
        boolean r2 = s.add("李四");
        boolean r3 = s.add("王五");
        boolean r4 = s.add("赵六");

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        //增强for
        for (String str : s) {
            System.out.println(str);
        }

        //lambda表达式
        s.forEach(str ->System.out.println(str));

    }
}
