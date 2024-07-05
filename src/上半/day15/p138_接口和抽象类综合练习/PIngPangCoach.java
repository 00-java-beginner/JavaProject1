package 上半.day15.p138_接口和抽象类综合练习;

public class PIngPangCoach extends Coach implements English{
    public PIngPangCoach() {
    }

    public PIngPangCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }
}
