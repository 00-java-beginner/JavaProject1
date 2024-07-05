package 上半.day16_day17;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    /*  JFrame  界面,窗体
        子类呢?也表示界面,窗体
        规定:GameJFrame这个界面表示的就是游戏的主界面
        以后跟游戏相关的所有逻辑都写在这个类中
*/
    Random r = new Random();
    //创建一个二维数组
    //目的：用来管理数据，加载图片的时候会根据二维数组中的数据加载
    int [][] data = new int[4][4];
    //定义两个变量记录0索引在二维数组中的坐标
    int x = 0;
    int y = 0;
    //定义一个变量记录路径（Windows）
    String path = "E:\\java\\JavaPorject1\\src\\上半\\image\\animal\\";
    //mac路径
    //String path = "/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/上半.image/animal/animal3/";

    //定义一个二维数组记录正确的值
    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    //定义一个变量记录步数
    int step = 0;

    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("收款码");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");
    public GameJFrame(){
        //1.初始化界面
        initJFrame();

        //2.初始化菜单
        initJMnuBar();

        //初始化数据(打乱图片)
        initDate();

        //3.初始化图片
        initImage();

        //让界面显示出来，建议写在最后
        this.setVisible(true);

    }

    private void initDate() {
        //1.定义一个一维数组，并打乱顺序
        int [] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //2.循环遍历得到每一个元素
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //定义一个临时变量记录最初的值
            int temp = tempArr[i];
            int index = r.nextInt(tempArr.length);
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        /*for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();*/

        //4.给二维数组添加数据
        //解法一
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0){
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }

        /*解法二
        //遍历二维数组，给里面的每一个数据赋值(利用自增思想)
        //外循环：二维数组
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            //内循环data【i】表示一维数组
            for (int j = 0; j < data[i].length; j++) {
                if (tempArr[i] == 0){
                    x = i / 4;
                    y = i % 4;
                }else {
                    //等号左边【i】【j】依次表示二维数组中的每一个位置
                    //等号右边表示取值从哪来：从一维数组中来（利用索引取值）
                    data[i][j] = tempArr[index];
                    //每次赋值后index自增一次
                    index++;
                }

            }
        }*/
        //5.打印二维数组
        /*for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }*/
    }

    private void initImage() {
        //清空图片
        this.getContentPane().removeAll();
        //对结果进行判断，如果结果为true表示两个数组里面的值相同，就添加胜利的图片
        if (victory()){
            //windows
            JLabel winJLabel = new JLabel(new ImageIcon("E:\\java\\JavaPorject1\\src\\上半\\image\\win.png"));
            //mac
            //JLabel winJLabel = new JLabel(new ImageIcon("/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/上半.image/win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }
        //将步数添加到界面中
        JLabel setpCount = new JLabel("步数：" + step);
        setpCount.setBounds(50,30,100,20);
        this.getContentPane().add(setpCount);
        //3.初始化图片
        //3.1创建一个图片ImageIcon的对象
        //ImageIcon icon = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\JavaTest\\上半.image\\animal\\animal3\\3.jpg");
        //定义一个变量，记录每次循环后的值，表示依次将不同的图片添加到容器中
        //int number = 1;
        //外循环 --- 表示将内循环执行了四次，先横向添加图片
        for (int i = 0; i < 4; i++) {
            //内循环 --- 表示在一行添加了四张图片
            for (int j = 0; j < 4; j++) {
                //获取二维数组的数据并赋值
                int num = data[i][j];
                //3.2创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path +num+".jpg"));
                //3.3设置图片的坐标
                jLabel.setBounds(105 * j + 83,105 * i + 134,105,105);

                //给图片添加边框
                //0:凸出   1:凹陷
                jLabel.setBorder(new BevelBorder(0));

                //3.把管理容器添加到界面中
                //注意：先要获取到隐藏容器才能进行添加
                //this.add(jLabel);
                this.getContentPane().add(jLabel);

                //注意：每次添加完成后需要将变量number自增一次，否则图片不会发生变化
                //number++;
            }
        }
        //细节：先加载的图片在上方，后加载的图片在下方，所以背景要最后加载
        //添加背景图片
        //Windows
        JLabel background = new JLabel(new ImageIcon("E:\\java\\JavaPorject1\\src\\上半\\image\\background.png"));
        //mac
        //JLabel background = new JLabel(new ImageIcon("/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/上半.image/background.png"));

        //设置背景的位置
        background.setBounds(40,40,508,560);

        //把背景添加到容器中
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    private void initJMnuBar() {
        //2.初始化菜单
        //2.1创建整个菜单的对象
        JMenuBar jMenuBar = new JMenuBar();

        //2.2创建菜单上面的两个选项的对象（功能，关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("打赏一下");
        //2.3创建更换图片
        JMenu changeImage = new JMenu("更换图片");
        //2.4将每一个选项下面的条目添加到选项当中
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        //给条目添加事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        //2.5将条目里面的两个选项添加到菜单里面
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //2.6给整个页面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //1.初始化界面
        //1.1设置界面的宽高
        this.setSize(603,680);
        //1.2设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //1.3设置界面置顶
        this.setAlwaysOnTop(true);
        //1.4设置界面居中
        this.setLocationRelativeTo(null);
        //1.5设置关闭方法
        this.setDefaultCloseOperation(3);
        //1.6取消默认居中放置，只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);
        //1.7给整个界面添加键盘监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65){
            //删除全部图片
            this.getContentPane().removeAll();
            //添加图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("E:\\java\\JavaPorject1\\src\\上半\\image\\background.png"));
            //mac
            //JLabel background = new JLabel(new ImageIcon("/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/上半.image/background.png"));
            //设置背景的位置
            background.setBounds(40,40,508,560);
            //把背景添加到容器中
            this.getContentPane().add(background);
            //刷新一下界面
            this.getContentPane().repaint();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        //判断游戏是否胜利，如果胜利 下面的代码不需要执行
        if (victory()){
            return;
        }
        //对上下左右进行判断
        //左：37  上：38  右：39  下：40
        if (code == 37){
            System.out.println("向左移动");
            if (y == 3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;
            //每按一次键盘步数自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();

        }else if (code == 38){
            System.out.println("向上移动");
            if (x == 3){
                return;
            }
            //逻辑：把空白方块下方的数字向上移动
            //x，y表示空白方块，x+1，y表示空白方块下方的数字
            //将空白方块下方的数字赋值给空白方块
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            //每按一次键盘步数自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();

        }else if (code == 39){
            System.out.println("向右移动");
            if (y == 0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            //每按一次键盘步数自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();

        }else if (code == 40){
            System.out.println("向下移动");
            if (x == 0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            x--;
            //每按一次键盘步数自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if (code == 65){
            initImage();
        }else if (code == 87){
            data= new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }

    //定义一个方法，用来判断二维数组中的数字与变量win中的数字是否相同
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem){
            //计步器清零
            step++;
            //再次打乱二维数组中的数据
            initDate();
            //重新加载图片
            initImage();

        }else if (obj == reLoginItem){
            System.out.println("重新登录");
            //关闭当前页面
            this.setVisible(false);
            //打开登录页面
            new LoginJFrame();
        }else if (obj == closeItem){
            System.exit(0);
        }else if (obj == accountItem){
            System.out.println("打赏一下");
            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象jlaval
            JLabel jLabel = new JLabel(new ImageIcon("E:\\java\\JavaPorject1\\src\\上半\\image\\money.png"));
            //mac
            //JLabel jLabel = new JLabel(new ImageIcon("/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/上半.image/money.png"));
            //设置位置和宽高
            jLabel.setBounds(0,0,794,819);
            //将图片添加到弹窗当中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(800,820);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭的情况下无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        }else if (obj == girl) {
            int index = r.nextInt(13) + 1;
            path = "E:\\java\\JavaPorject1\\src\\上半\\image\\girl\\girl" + index +"\\";
            step = 0;
            initDate();
            initImage();
        }else if (obj == animal){
            int index = r.nextInt(8) + 1;
            path = "E:\\java\\JavaPorject1\\src\\上半\\image\\animal\\animal" + index +"\\";
            step = 0;
            initDate();
            initImage();
        }else if (obj == sport){
            int index = r.nextInt(10) + 1;
            path = "E:\\java\\JavaPorject1\\src\\上半\\image\\sport\\sport" + index +"\\";
            step = 0;
            initDate();
            initImage();
        }
    }
}
