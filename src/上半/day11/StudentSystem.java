package 上半.day11;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    //System.exit(0);//表示停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student1> list) {
        //创建学生对象
        Student1 stu = new Student1();
        //键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("当前学生id已存在，请重新输入");
            } else {
                stu.setId(id);
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("请输入家庭地址");
        String address = sc.next();
        stu.setAddress(address);
        //添加到集合中
        list.add(stu);
        //提示一下用户
        System.out.println("学生信息添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student1> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的学生id");
        String id = sc.next();
        //查询id在集合中的索引
        int index = getIndex(list, id);
        if (index >= 0) {
            //表示存在，直接删除
            list.remove(index);
            System.out.println("id为" + id + "的学生删除成功");
        } else {
            System.out.println("当前学生id不存在，删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student1> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }
        Student1 stu = list.get(index);
        System.out.println("请输入新的学生姓名");
        String newName = sc.next();
        stu.setName(newName);
        System.out.println("请输入新的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);
        System.out.println("请输入新的学生地址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);
        System.out.println("学生信息修改成功");
    }

    //查找学生
    public static void queryStudent(ArrayList<Student1> list) {
        //判断集合的长度，如果为0则表示集合中没有数据
        if (list.size() == 0) {
            System.out.println("当前学生信息不存在");
            return;
        }
        //打印表头
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭地址");
        //遍历集合获得每一个学生信息
        for (int i = 0; i < list.size(); i++) {
            Student1 stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //判断id在集合中是否存在
    public static boolean contains(ArrayList<Student1> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            Student1 stu = list.get(i);
//            String sid = stu.getId();
//            if (sid.equals(id)){
//                return true;
//            }
//        }
//        return false;
        return getIndex(list, id) >= 0;
    }

    //通过id获取索引
    public static int getIndex(ArrayList<Student1> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            Student1 stu = list.get(i);
            //得到每一个学生对象的id
            String sid = stu.getId();
            //拿着集合中的id和要查询的id进行比较
            if (sid.equals(id)) {
                //如果存在返回索引
                return i;
            }
        }
        //如果不存在返回-1
        return -1;
    }
}
