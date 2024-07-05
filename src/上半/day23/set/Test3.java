package 上半.day23.set;

import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((o1, o2)-> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2):i;
            return i;
        }
        );
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");



        System.out.println(ts);
    }
}
