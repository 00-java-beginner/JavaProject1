package 上半.day9.p92_对象数组的练习;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] arr = new Goods[3];
        //2.创建对象
        Goods g1 = new Goods("001","帝王蟹",1999.0,10);
        Goods g2 = new Goods("002","波士顿龙虾",999.0,20);
        Goods g3 = new Goods("003","珍宝蟹",599.0,30);
        //3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //4.打印数组
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
