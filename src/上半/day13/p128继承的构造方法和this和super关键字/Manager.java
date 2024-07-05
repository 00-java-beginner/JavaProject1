package 上半.day13.p128继承的构造方法和this和super关键字;

public class Manager extends Employee {
    private double bouns;

    //空参构造
    public Manager(){

    }
    //带全部参数构造
    public Manager(String id,String name,double salary,double bouns){
        super(id,name,salary);
        this.bouns = bouns;
    }
    public double getBouns(){
        return bouns;
    }
    public void setBouns(double bouns){
        this.bouns = bouns;
    }
    @Override
    public void work(){
        System.out.println("管理其他人");
    }
}
