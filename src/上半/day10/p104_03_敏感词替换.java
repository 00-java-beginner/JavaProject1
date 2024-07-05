package 上半.day10;

public class p104_03_敏感词替换 {
    public static void main(String[] args) {
        //1.定义一个变量接收说的话
        String talk = "你玩的真好，以后不要玩了，TMD，CNM";

        //2.定义一个敏感词库，这样就不用一个个替换了
        String [] arr = {"TMD","CNM","MLGB","QNMB"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
