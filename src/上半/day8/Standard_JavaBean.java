package 上半.day8;

public class Standard_JavaBean {
    public static void main(String[] args) {
        /*
        1.类名需要见名之意
        2.成员变量使用private修饰
        3，至少提供两个构造方法（无参和带全部参数）
        4.提供每一个成员变量对应的set和get，如果有其他行为，也要加上
        5.PTG：构成JavaBean快速插件
        */
    }
    //需求：javabean练习
    //1.属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
    //2.创建构造方法
    //快捷键alt + insert，选择constructor
    //空参
    public Standard_JavaBean(){}
    //带全部参数的构造
    public Standard_JavaBean(String username,String password,String email,String gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    //提供每一个成员变量对应的set和get
    //快捷键alt + insert,选择getter and setter
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
