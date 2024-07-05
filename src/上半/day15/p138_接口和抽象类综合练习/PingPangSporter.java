package 上半.day15.p138_接口和抽象类综合练习;

public class PingPangSporter extends Sporter implements English{
    public PingPangSporter() {
    }

    public PingPangSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void Study() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }
}