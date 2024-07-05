package 上半.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class UserSystem {
    //程序主入口
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登陆  2.注册  3.忘记密码  4.退出");
            String choose = sc.next();
            switch (choose){
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    //1.注册
    private static void register(ArrayList<User> list) {
        //1.键盘录入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            boolean flag1 = checkUsername(username);
            //判断用户输入的用户名格式是否正确，正确再判断用户是否唯一
            if (!flag1){
                System.out.println("当前用户名格式不正确，请重新输入用户名");
                continue;
            }
            //2.用户名唯一判断
            boolean flag2 = contains(list,username);
            if (flag2){
                //存在，需要重新输入
                System.out.println("当前用户名已存在，请重新输入");
            }else {
                //不存在，通过校验，可以输入下面的内容
                System.out.println("当前用户名可用");
                break;
            }
        }
        //2.键盘录入密码
        String password;
        while (true) {
            System.out.println("请输入需要注册用户的密码");
            password = sc.next();
            System.out.println("请输入确认密码");
            String twopassword = sc.next();
            if (!password.equals(twopassword)){
                System.out.println("两次输入的密码不一致，请重新输入");
            }else {
                System.out.println("密码一致，允许录入下面的数据");
                break;
            }
        }
        //3.键盘录入身份证号码
        String id;
        while (true) {
            System.out.println("请输入身份证号码");
            id = sc.next();
            boolean flag = checkId(id);
            if (flag){
                System.out.println("身份证号码满足要求");
                break;
            }else {
                System.out.println("身份证号码格式不正确，请重新输入");
                continue;
            }
        }
        //4.键盘录入手机号码
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag){
                System.out.println("手机号格式正确");
                break;
            }else {
                System.out.println("手机号格式错误，请重新输入");
                continue;
            }
        }
        //5.将数据放到用户对象中
        User u = new User(username,password,id,phoneNumber);
        list.add(u);
        System.out.println("注册成功");
    }
    //1.1校验手机号码是否合法
    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度为11位，不能以0开头，必须是全数字
        //1.长度为11位
        if (phoneNumber.length() != 11){
            return false;
        }
        //2.不能以0开头
        if (phoneNumber.startsWith("0")){
            return false;
        }
        //3.必须是全数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')){
                return false;
            }
        }
        //当上面判断全部完成后表示所有非法的都已经判断完了
        return true;
    }
    //1.2校验身份证是否合法
    private static boolean checkId(String id) {
        //长度为18，不能以0开头，前17位必须是数字，18位可以是数字也可以是X和x
        //1.长度为18
        if (id.length() != 18){
            return false;
        }
        //2.不能以0开头
        boolean flag = id.startsWith("0");
        if (flag){
            //如果第一位是0开头会返回一个true，那么判断需要返回false
            return false;
        }
        //3.前17位必须是数字
        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
            //如果不在0-9的范围内，直接返回false
            if (!(c >= '0' && c <= '9')){
                return false;
            }
        }
        //4.对最后一位进行判断
        char endChar = id.charAt(id.length() - 1);
        if ((endChar >= '0' && endChar <= '9')||(endChar == 'x')||(endChar == 'X')){
            return true;
        }else {
            return false;
        }
    }
    //1.3判断用户名是否存在集合当中
    private static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if (rightUsername.equals(username)){
                return true;
            }
        }
        return false;
    }
    //1.4校验用户名的格式是否正确
    private static boolean checkUsername(String username){
        //用户名长度必须在3~15位之间
        int len = username.length();
        if (len < 3 || len > 15){
            return false;
        }
        //进行只能是字母加数字的组合的判断
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9'))){
                return false;
            }
        }
        //进行不能是纯数字的判断
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){
                count ++;
                break;
            }
        }
        //当上面条件全部满足以后才可以表示判断完成
        return count > 0;
    }
    //2.登陆
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            //1.验证用户名是否存在，不存在直接结束方法
            boolean flag = contains(list, username);
            if (!flag){
                System.out.println("用户名" + username + "不存在，请注册");
                return;
            }
            //2.输入密码
            System.out.println("请输入密码");
            String password = sc.next();
            //3.判断验证码是否正确,如不正确,重新输入
            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确的验证码为：" + rightCode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)){
                    System.out.println("验证码正确");
                    break;
                }else {
                    System.out.println("验证码错误");
                    continue;
                }
            }
            //4.校验用户名和密码是否正确，有3次机会
            User userInfo = new User(username,password,null,null);
            boolean result = checkInfo(list,userInfo);
            if (result){
                System.out.println("登陆成功");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            }else {
                System.out.println("登陆失败，用户名或密码错误");
                if (i == 2){
                    System.out.println("当前账号" + username + "被锁定");
                    return;
                }else {
                    System.out.println("还剩下" + (2 - i) + "次机会");
                }
            }
        }


    }
    //2.1生成验证码，四位大小写字母 + 一位数字，数字的位置可以随机
    private static String getCode(){
        //1.创建一个集合添加所有的大小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            //利用ascii码表的特性添加，强转为字符形式
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }
        //2.随机抽取四个
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);

        }
        //3.把一个随机数字添加到末尾
        int Number = r.nextInt(10);
        sb.append(Number);
        //先将字符串转换成数组
        char[] arr = sb.toString().toCharArray();
        //定义一个随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        //将随机索引跟最大索引进行交换
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }
    //2.2判断用户名和密码是否在集合中
    private static boolean checkInfo(ArrayList<User> list,User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())){
                return true;
            }
        }
        return false;
    }
    //3.忘记密码
    private static void forgetPassword(ArrayList<User> list) {
        //1.键盘录入用户名,判断当前用户名是否存在,如不存在,直接结吉束方法,并提示:未注册
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag){
            System.out.println("当前用户未注册，请注册");
            return;
        }
        //2.键盘录入身份证号码和手机号码
        System.out.println("请输入身份证");
        String id = sc.next();
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();
        //3.判断当前用户的身份证号码和手机号码是否一致,
        //通过索引获取用户对象
        int index = findIndex(list,username);
        User user = list.get(index);
        //比较用户对象中的身份证和手机号是否相同
        //如果不一致,则提示:账号信息不匹配,修改失败。
        if (!(user.getId().equalsIgnoreCase(id) && user.getPhonenumber().equals(phoneNumber))){
            System.out.println("身份证或手机号有误，不能修改");
            return;
        }
        //如果一致,则提示输入密码,进行修改。
        String password;
        while (true) {
            System.out.println("请输入新的密码");
            password = sc.next();
            System.out.println("再次输入密码");
            String againPassword = sc.next();
            //对两次输入的新密码进行判断
            if (password.equals(againPassword)){
                System.out.println("两次输入的密码一致");
                break;
            }else {
                System.out.println("两次输入的密码不一致，请重新输入");
                continue;
            }
        }
        //代码执行到这里以后表示已经得到新的且正确的密码
        user.setPassword(password);
        System.out.println("密码修改成功");

    }
    //3.1通过索引获取对应的用户信息
    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            //判断集合中有没有键盘录入的用户，如果有直接返回对应的索引i
            if (user.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }
}
