package 上半.day11;

import java.util.ArrayList;

public class p115_返回多个数据 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Phone> list = new ArrayList<>();
        //2.创建对象
        Phone p1 = new Phone("华为",6999);
        Phone p2 = new Phone("苹果",8999);
        Phone p3 = new Phone("小米",2999);
        //3.添加到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //4.调用方法
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + "," + phone.getPrice());
        }
    }
    //定义一个方法判断价格低于三千的手机,将低于三千的手机信息返回
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个集合，用于接收数据
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //获取对象
            Phone p = list.get(i);
            //获取对象里面的手机价格
            int price = p.getPrice();
            if (price < 3000){
                resultList.add(p);
            }
        }
        return resultList;
    }
}
