package 上半.day9.p94andp95_添加和遍历;

public class Test2 {
    public static void main(String[] args) {
        //1.创建数组
        Student[] arr = new Student[3];
        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student(001, "张三", 18);
        Student stu2 = new Student(002, "李四", 20);
        Student stu3 = new Student(003, "王五", 22);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //要求5:查询数组id为“002”的学生，如果存在，则将他的年龄+1岁*/
        //3.先要找到id为002的学生对应的索引
        int index = getIndex(arr,004);
        //4.判断索引
        if (index >= 0){
            //如果存在，则将他的年龄+1岁
            //先获取当前学生的索引
            Student stu = arr[index];
            //利用索引获取学生的年龄
            int newAge = stu.getAge() + 1;
            //将修改后的年龄利用set方法传递
            stu.setAge(newAge);
            //循环数组
            printArr(arr);
        }else {
            System.out.println("当前id不存在，无法修改");
        }
    }
    public static int getIndex(Student[] arr , int id){
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student stu = arr[i];
            //对stu做一个非空判断
            if (stu != null){
                int sid = stu.getId();
                if (sid == id){
                    return i;
                }
            }
        }
        //当循环结束后还没有找到就表示不存在，由于没有-1这个索引，所以返回-1
        return -1;
    }
    public static void printArr(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }
}
