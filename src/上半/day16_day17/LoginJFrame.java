package 上半.day16_day17;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    /*
    LoginJFrame 表示登录界面
    以后跟登录相关的代码都写在这里
    */
    //定义一个集合，用来存储用户名和密码
    static ArrayList<User> allUsers = new ArrayList<>();
    static {
        allUsers.add(new User("zhangsan","123456"));
        allUsers.add(new User("lisi","123456"));
    }
    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();
    //正确的验证码
    JLabel rightCode = new JLabel();
    String path = "E:\\java\\JavaPorject1\\src\\上半\\image\\login\\";

    public LoginJFrame() {
        //初始化界面
        initJFrame();
        //在这个界面添加东西
        initView();
        //让界面展示出来
        this.setVisible(true);
    }

    public void initJFrame() {
        this.setSize(488, 430);
        //设置界面的标题
        this.setTitle("拼图 登录");
        //设置关闭方法
        this.setDefaultCloseOperation(3);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //取消内部默认布局
        this.setLayout(null);
    };
    public void initView() {
        //1.添加用户名的图片
        JLabel usernameTest = new JLabel(new ImageIcon(path + "用户名.png"));
        usernameTest.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameTest);
        //添加用户名的输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //2.添加密码的图片
        JLabel passwordTest = new JLabel(new ImageIcon(path + "密码.png"));
        passwordTest.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordTest);
        //添加密码的输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //3.添加验证码的图片
        JLabel codeText = new JLabel(new ImageIcon(path + "验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);
        //添加验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);
        //获取验证码内容
        String codeStr = CodeUtil.getCode();
        //将获取到的验证码进行传递
        rightCode.setText(codeStr);
        //绑定鼠标事件
        rightCode.addMouseListener(this);
        //设置位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面中
        this.getContentPane().add(rightCode);

        //4.添加登录的图片
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon(path + "登录按钮.png"));
        //去除按钮的边框
        login.setBorderPainted(false);
        //去除按钮的背景
        login.setContentAreaFilled(false);
        //给登录添加鼠标时间
        login.addMouseListener(this);
        //添加到界面中
        this.getContentPane().add(login);

        //5.添加注册的图片
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon(path + "注册按钮.png"));
        //去除按钮的边框
        register.setBorderPainted(false);
        //去除按钮的背景
        register.setContentAreaFilled(false);
        //给注册添加鼠标时间
        register.addMouseListener(this);
        //添加到界面中
        this.getContentPane().add(register);

        //6.添加背景图片
        JLabel background = new JLabel(new ImageIcon(path + "background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);
    };
    //点击
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login){
            //1.获取
            //获取当前输入的用户名
            String usernameInput = username.getText();
            //获取当前输入的密码
            String passwordInput = password.getText();
            //获取当前输入的验证码
            String codeInput = code.getText();
            //创建对象记录输入的用户名和密码，用于后续判断
            User userInfo = new User(usernameInput,passwordInput);
            //2.判断
            //对验证码进行判断
            if (codeInput.isEmpty()){
                showJDialog("验证码不能为空");
            }else if (usernameInput.isEmpty() || passwordInput.isEmpty()){
                showJDialog("用户名或密码为空");
                //判断验证码是否正确(equalsIgnoreCase用于忽略大小写)
            }else if (!codeInput.equalsIgnoreCase(rightCode.getText())){
                showJDialog("验证码错误");
                //判断用户名和密码是否正确
            }else if (contains(userInfo)){
                System.out.println("登录成功");
                //需要关闭当前登录页面
                this.setVisible(false);
                //跳转到游戏界面
                new GameJFrame();
            }else {
                showJDialog("用户名或密码错误");
            }
        }else if (e.getSource() == register){
            System.out.println("点击了注册按钮");
        }else if (e.getSource() == rightCode){
            String code = CodeUtil.getCode();
            rightCode.setText(code);
        }
    }
    //按住不松
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login){
            login.setIcon(new ImageIcon(path + "登录按下.png"));
        }else if (e.getSource() == register){
            register.setIcon(new ImageIcon(path + "注册按下.png"));
        }
    }
    //松开按钮
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login){
            login.setIcon(new ImageIcon(path + "登录按钮.png"));
        }else if (e.getSource() == register){
            register.setIcon(new ImageIcon(path + "注册按钮.png"));
        }
    }
    //鼠标滑入
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    //鼠标滑出
    @Override
    public void mouseExited(MouseEvent e) {
    }

    //定义一个方法，用来判断用户名和密码是否存在
    public boolean contains(User userInput){
        //先用循环获取到当前集合里面的全部参数
        for (int i = 0; i < allUsers.size(); i++) {
            //将集合里面的参数赋值给一个新的变量
            User rightUser = allUsers.get(i);
            //用当前传递的参数与新变量里面的参数进行比较
            if (userInput.getUsername().equals(rightUser.getUsername())
                    && userInput.getPassword().equals(rightUser.getPassword()) ){
                //如果一样返回true
                return true;
            }
        }
        //如果不一样返回false
        return false;
    }

    //定义一个方法，用于弹窗提示
    public void showJDialog(String content){
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);

    }
}
