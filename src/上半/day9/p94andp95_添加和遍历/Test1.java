package 上半.day9.p94andp95_添加和遍历;

public class Test1 {
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
        //3.要求3:通过id删除学生信息
        //要找到id在数组中所对应的索引
        int index = getIndex(arr,001);

        //如果存在，则删除
        if (index >= 0){
            arr[index] = null;
            //要求4:删除完毕之后，遍历所有学生信息。
            printArr(arr);
        }else {
            //如果不存在，则提示删除失败。
            System.out.println("当前索引不存在，删除失败");
        }
    }
    public static void printArr(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }
    //1.要干嘛？  找索引
    //2.需要什么？ 数组和id
    //是否需要调用？需要
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
}
