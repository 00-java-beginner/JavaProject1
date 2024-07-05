package 上半.day23.set;

public class Hashset {
    public static void main(String[] args) {
        Student s1 = new Student(22,"张三");
        Student s2 = new Student(22,"张三");
        //如果没有重写hashcode方法，比较的是地址值，只有重写了才是比较属性值
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());

        /*
        HashSet的五个问题：
            1.HashSet底层的数据结构是什么
            由数组+链表+红黑树组成的

            2.HashSet添加元素的过程
                1.创建一个默认长度为16，默认加载因子为0.75的数组，数组名为table
                2.根据元素的哈希值跟数组长度计算出应存入的位置
                3.判断当前位置是否为null，如果是null，则直接存入
                4.如果当前位置不是null，表示有元素，则调用equals()方法与当前位置的属性进行比较
                    如果相同，则舍弃不存
                    如果不同，则存入数组，形成链表
                5.DK8以前，新元素存入数组，老元素挂在新元素下面形成链表
                6.JDK8之后，新元素挂在老元素下面形成链表
                7.当链表长度大于8且数组长度大于等于64时，当前链表会自动转成红黑树
                8.如果集合中存储的是自定义对象，必须重写 hashCode 和 equals 方法

            3.HashSet存和取的顺序为什么不一样
            HashSet 在遍历的时候是从数组的0索引开始遍历的，每个索引下都要遍历该索引下对应的链表，
            当遍历到一个索引，这个索引的值为空时，会跳过，遍历下一个索引，
            该索引下对应有链表时，就会遍历这个链表，若是红黑树，也会遍历这个红黑树，
            按这个原则遍历数组，因为某个索引下对应的元素不一定就是存入时的顺序，所以HashSet 在存和取时的顺序也不一定相同。

            4.HashSet为什么没有索引
            HashSet 是由数组+链表+红黑树组成的，数组是有索引的，
            但是存在HashSet 中的元素是通过链表或红黑树的形式挂在数组的每个索引下的，
            也就是每个索引可能对应多个元素，所以HashSet 不能由索引找到对应的元素。

            5.HashSet是利用什么机制保证数据去重的
            HashSet 是通过HashCode计算出哈希值，从而确定当前元素应该存放的位置，
            然后通过equals方法去比较对象内部的属性值是否一致，保证不会出现重复的元素。



        */
    }
}
