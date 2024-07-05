package 上半.day9.p91_文字版格斗游戏;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces = {"帅气","英俊","潇洒"};
    String[] girlfaces = {"美丽","漂亮","风骚"};
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，%s连连后退",
            "%s使出了一招【佛山无影脚】，%s连连后退",
            "%s使出了一招【降龙十八掌】，%s连连后退"
    };
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果%s被击飞，严重受伤",
            "结果%s退了几步，受了内伤"
    };
    public Role() {
    }
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随即长相
        setFace(gender);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public void attack(Role role){
        Random r = new Random();
        //输出攻击的效果
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        System.out.printf(KungFu,this.getName(),role.getName());
        //由于printf不会换行，为了代码阅读性需要加上println进行换行
        System.out.println();
        //1.计算造成的伤害
        int hurt = r.nextInt(20) + 1;
        //2.计算剩余血量
        int remainBlood = role.getBlood() - hurt;
        //3.对剩余血量做一个验证，如果为负数，则修改为0
        remainBlood = Math.max(remainBlood, 0);
        //4.修改一下挨揍的人的血量
        role.setBlood(remainBlood);
        //受伤的描述
        //血量大于90 0索引的描述
        //血量大于50 1索引的描述
        //血量小于20 2索引的描述
        if (remainBlood > 80){
            System.out.printf(injureds_desc[0],role.getName());
        }else if (remainBlood > 50){
            System.out.printf(injureds_desc[1],role.getName());
        }else {
            System.out.printf(injureds_desc[2],role.getName());
        }
        //由于printf不会换行，为了代码阅读性需要加上println进行换行
        System.out.println();
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getFace() {
        return face;
    }
    public void setFace(char gender) {
        //判断传入的是男还是女
        //随机传入
        Random r = new Random();
        if (gender =='男'){
            //传入男脸
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if (gender == '女'){
            //传入女脸
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "面目狰狞";
        }
    }
    //展示所有角色的信息
    public void showRoleInfo(){
        System.out.println("姓名为" + getName());
        System.out.println("血量为" + getBlood());
        System.out.println("性别为" + getGender());
        System.out.println("长相为" + getFace());
    }
}
