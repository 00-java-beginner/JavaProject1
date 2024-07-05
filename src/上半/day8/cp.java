package 上半.day8;

public class cp {
    //定义属性
    private String food;
    private int price;
    public void setFood(String food) {
        //this关键字的作用：可以将局部变量和成员变量的取值范围进行区分
        //等号左边加上this的作用：表示右边的变量取值范围为就近原则不变
        //左边的依旧是对成员变量取值，这样可以解决变量名难取的情况
        this.food = food;
    }
    public String getFood() {
        return food;
    }
    public void setPrice(int price) {
        if (price >= 0 && price <= 88) {
            this.price = price;
        } else {
            System.out.println("非法参数");
        }
    }
    public int getPrice() {
        return price;
    }

    //定义行为
    public void eat() {
        System.out.println("东西很好吃");
    }
}
