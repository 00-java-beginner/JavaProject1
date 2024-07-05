package 上半.day15.p138_接口和抽象类综合练习;

public class Test {
    public static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter(35,"马龙");
        System.out.println(pps.getAge() + ", " + pps.getName());
        pps.SpeakEnglish();
        pps.Study();
    }
}
