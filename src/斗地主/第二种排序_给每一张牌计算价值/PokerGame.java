package 斗地主.第二种排序_给每一张牌计算价值;

import java.util.*;

public class PokerGame {
    //创建一个双列集合，用于存储牌的键值对信息
    static HashMap<String, Integer> hm = new HashMap<>();
    static ArrayList<String> list = new ArrayList<>();

    //准备牌
    //思想：静态代码块
    //特点：随着类的加载而加载，而且只执行一次
    static {
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //遍历得到每一个数字
        for (String c : color) {
            //遍历得到每一个花色
            for (String n : number) {
                //将牌与序号添加到集合当中
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");

        //指定牌的价值,利用牌上的数字判断在集合当中是否存在
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);
    }

    public PokerGame() {
        //1.洗牌
        Collections.shuffle(list);
        //2.发牌
        ArrayList<String> lord = new ArrayList<>();//用于存储底牌
        ArrayList<String> player1 = new ArrayList<>();//用于存储第一个人的牌
        ArrayList<String> player2 = new ArrayList<>();//用于存储第二个人的牌
        ArrayList<String> player3 = new ArrayList<>();//用于存储第三个人的牌

        //2.1通过索引获取所有的牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //将前三张牌添加到底牌当中
            if (i <= 2) {
                lord.add(poker);
                continue;
            }
            //添加剩下的三个人的牌
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }

        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //3.看牌
        lookPoker("底牌", lord);
        lookPoker("小明", player1);
        lookPoker("小红", player2);
        lookPoker("小黑", player3);
    }

    //定义一个方法用于查看不同集合下对应的牌
    //参数一：调用时需要传入的姓名
    //参数二：存放所有牌的数组
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        //遍历TreeSet集合得到每一个序号，再用序号去集合中找真正的牌
        for (String poker : list) {
            //调用get方法，传入序号，得到集合中真正的牌
            System.out.print(poker + " ");
        }
        System.out.println();
    }

    //定义一个方法，利用牌的价值进行排序
    public void order(ArrayList<String> list) {
        list.sort((o1, o2) -> {
            //利用截取的方法得到o1的花色
            String color1 = o1.substring(0, 1);
            //调用方法获取o1的价值
            int value1 = getValue(o1);

            //利用截取的方法得到o2的花色
            String color2 = o2.substring(0, 1);
            //调用方法获取o2的价值
            int value2 = getValue(o2);

            //比较o1和o2的价值
            int i = value1 - value2;

            //如果i=0表示两个牌的价值一样，此时比较花色
            return i == 0 ? color1.compareTo(color2) : i;
        });
    }

    //定义一个方法，计算牌的价值
    //参数:牌
    //返回值:价值
    public int getValue(String poker) {
        //获取牌上的数字
        String number = poker.substring(1);
        //利用数字去集合当中判断是否存在
        if (hm.containsKey(number)) {
            //存在，直接获取
            return hm.get(number);
        } else {
            //不存在，类型转换
            return Integer.parseInt(number);
        }
    }
}
