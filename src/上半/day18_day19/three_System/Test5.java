package 上半.day18_day19.three_System;

public class Test5 {
    public static void main(String[] args) {
        //拷贝数组
        //int [] arr1 = {1,2,3,4,5};
        //int [] arr2 = new int[5];
        //参数一:数据源,要拷贝的数据从哪个数组而来
        //参数二:从数据源数组中的第几个索引开始拷贝
        //参数三:目的地,我要把数据拷贝到哪个数组中
        //参数四:目的地数组的索引。
        //参数五:拷贝的个数
        //System.arraycopy(arr1,0,arr2,0,5);
//    for (int i = 0; i < arr2.length; i++) {
//        System.out.println(arr2[i]);
//    }
        //细节：
        //1.如果数据源数组和目的地数组都是基本数据类型,那么两两者的类型必须保持一致,否则会报错
    /*int [] arr1 = {1,2,3,4,5};
    double [] arr2 = new double[5];
    System.arraycopy(arr1,0,arr2,0,5);
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }*/

        //2.在拷贝的时候需要考虑数组的长度,如果超出范围也会报错
    /*int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
    int [] arr2 = new int[5];
    System.arraycopy(arr1,0,arr2,0,10);*/

        //3.如果数据源数组和目的地数组都是引用数据类型,那么子类类型可以赋值给父类类型
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 24);

        Student[] arr1 = {s1, s2, s3};
        Student[] arr2 = new Student[3];

        System.arraycopy(arr1, 0, arr2, 0, 3);
        for (Student stu : arr2) {
            System.out.println(stu);
        }
    }
}
class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

}
