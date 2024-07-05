package 上半.day16_day17;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    /*
   RegisterJFrame:注册
   以后跟注册相关的代码都写在注册里面
   */
    public RegisterJFrame(){
        this.setSize(488,500);
        //设置界面的标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭方法
        this.setDefaultCloseOperation(3);




        this.setVisible(true);
    }
}
