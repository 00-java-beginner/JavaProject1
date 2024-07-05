package 斗地主.登录;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    String path = "E:\\JavaProject1\\src\\斗地主\\image\\poker\\";
    //牌的名字，格式：数字 - 数字
    private String name;

    //牌显示的是正面还是反面
    private boolean up;

    //是否可以被点击
    private boolean canClick = false;

    //当前的状态，表示牌当时是否被点击了
    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;

        //判断当前牌是正面还是反面
        if (this.up) {
            //如果为true，表示正面
            turnFront();
        } else {
            //false表示反面
            turnRear();
        }
        //设置牌的高度
        this.setSize(71, 96);
        //把牌显示出来
        this.setVisible(true);
        //给牌添加鼠标监听事件
        this.addMouseListener(this);
    }

    public Poker() {
    }

    public Poker(String path, String name, boolean up, boolean canClick, boolean clicked) {
        this.path = path;
        this.name = name;
        this.up = up;
        this.canClick = canClick;
        this.clicked = clicked;
    }

    //显示正面
    public void turnFront() {
        this.setIcon(new ImageIcon(path + name + ".png"));
        this.up = true;
    }

    //显示反面
    public void turnRear() {
        this.setIcon(new ImageIcon(path + "rear.png"));
        this.up = false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //点击
        //判断当前的牌是否可以被点击
        if (canClick){
            //定义一个变量记录牌位移的像素
            int step = 0;
            if (clicked){
                //true:表示当前的牌已经被点击
                step = 20;
            }else {
                //false:表示当前的牌没有被点击
                step = -20;
            }
            //修改clicked的默认值
            clicked = !clicked;
            //修改牌的位置
            Point from = this.getLocation();
            //创建一个Point对象，表示结束位置
            Point to = new Point(from.x,from.y + step);
            //把最新的位置设置给牌
            this.getLocation(to);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{path = " + path + ", name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}
