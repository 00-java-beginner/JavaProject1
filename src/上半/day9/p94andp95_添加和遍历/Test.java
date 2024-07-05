package 上半.day9.p94andp95_添加和遍历;

public class Test {
    public static void main(String[] args) {
            /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
            学生的属性:学号，姓名，年龄。
            要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
            要求2:添加完毕之后，遍历所有学生信息。
            要求3:通过id删除学生信息
            如果存在，则删除，如果不存在，则提示删除失败。
            要求4:删除完毕之后，遍历所有学生信息。
            要求5:查询数组id为“002”的学生，如果存在，则将他的年龄+1岁*/
        //1.创建数组
        Student[] arr = new Student[3];
        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student(001, "张三", 18);
        Student stu2 = new Student(002, "李四", 20);
        Student stu3 = new Student(003, "王五", 22);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //3.要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //1.拆解：再次添加一个学生对象
        Student stu4 = new Student(004, "赵六", 24);
        //2.拆解：唯一性判断
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //存在：不添加
            System.out.println("当前id已存在");
        } else {
            //不存在：添加  会有两种情况
            //1.数组已满 --- 需要创建一个新的数组，长度是老数组+1
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //要求2:添加完毕之后，遍历所有学生信息。
                printArr(newArr);
            } else {
                //2.数组未满 --- 直接添加
                //由于getCount获取到的是数组中已经有几个元素存在
                //所以可以直接将count当作索引进行赋值，因为索引是从0开始的，可以直接调用
                arr[count] = stu4;
                //要求2:添加完毕之后，遍历所有学生信息。
                printArr(arr);
            }
        }
    }

    //定义一个方法，用来遍历学生信息
    public static void printArr(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }

    //定义一个数组，用来接收新的数组，长度为老数组+1
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环变量得到老数组
        //将老数组赋值给新数组
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        //返回新数组
        return newArr;
    }

    //定义方法对数组是否存满进行判断
    public static int getCount(Student[] arr) {
        int count = 0;
        for (Student student : arr) {
            //由于数组的初始化默认值为null，在这里只需要对数组中是否存在null进行判断就可以得到数组是否存满
            if (student != null) {
                count++;
            }
        }
        return count;
    }

    //定义方法对学号进行判断  判断需要：数组和id
    public static boolean contains(Student[] arr, int id) {
        //1.利用循环先得到数组中的元素
        for (Student stu : arr) {
            //2.将数组中获取到的元素赋值给新的变量
            //3.获取数组中的id
            //注意：由于数组可能是未存满的，这样会导致stu获取到null
            //但是null是不能去调用方法的，所以需要对stu进行一个非空判断，否则代码会报错
            if (stu != null) {
                int sid = stu.getId();
                //4.对学号进行唯一性判断
                if (sid == id) {
                    return true;
                }
            }

        }
        //注意：不能将false写在循环里面，必须写在循环外面，
        //循环完全结束后没有一样的才可以返回false，表示当前id在数组中不存在
        return false;
    }
}
