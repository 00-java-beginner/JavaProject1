package 斗地主.第一种排序_利用序号;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
public class PokerGame {
    //创建一个双列集合，用于存储牌的键值对信息
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    //准备牌
    //思想：静态代码块
    //特点：随着类的加载而加载，而且只执行一次
    static {
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //定义一个变量记录序号，利用序号跟集合当中的键值对产生对应关系
        int serialNumber = 1;
        //遍历得到每一个数字
        for (String n : number) {
            //遍历得到每一个花色
            for (String c : color) {
                //将牌与序号添加到集合当中
                hm.put(serialNumber, c + n);
                //将序号添加到单列数组当中，方便后续操作
                list.add(serialNumber);
                //每添加一次序号需要自增一次
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        serialNumber++;
        list.add(serialNumber);
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
    }

    public PokerGame() {
        //1.洗牌
        Collections.shuffle(list);
        //2.发牌
        TreeSet<Integer> lord = new TreeSet<>();//用于存储底牌
        TreeSet<Integer> player1 = new TreeSet<>();//用于存储第一个人的牌
        TreeSet<Integer> player2 = new TreeSet<>();//用于存储第二个人的牌
        TreeSet<Integer> player3 = new TreeSet<>();//用于存储第三个人的牌

        //2.1通过索引获取所有的牌
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            //将前三张牌添加到底牌当中
            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            }
            //添加剩下的三个人的牌
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }

        //3.看牌
        lookPoker("底牌", lord);
        lookPoker("小明", player1);
        lookPoker("小红", player2);
        lookPoker("小黑", player3);
    }

    //定义一个方法用于查看不同集合下对应的牌
    //参数一：调用时需要传入的姓名
    //参数二：存放所有牌的数组
    public void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.print(name + ": ");
        //遍历TreeSet集合得到每一个序号，再用序号去集合中找真正的牌
        for (int serialNumber : ts) {
            //调用get方法，传入序号，得到集合中真正的牌
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
