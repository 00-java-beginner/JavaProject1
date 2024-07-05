package 上半.day11;

import java.util.ArrayList;

public class p114_查找用户是否存在 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<User> list = new ArrayList<>();
        //2.创建对象
        User u1 = new User("001","zhangsan","123456");
        User u2 = new User("002","lisi","12345678");
        User u3 = new User("003","wangwu","123456qwe");
        //3.添加元素到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //4.调用方法
        boolean flag = contains(list,"001");
        System.out.println(flag);
        //5.查找索引
        int index = getIndex(list,"001");
        System.out.println(index);
    }
    //定义方法查询id是否存在
    public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            //先获取用户对象
            User u = list.get(i);
            //获取用户对象里面的id
            String uid = u.getId();
            //进行判断
            if (uid.equals(id)){
                return true;
            }
        }
        return false;
    }
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
