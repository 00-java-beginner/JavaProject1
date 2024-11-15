package 下半.day27_异常_file_综合练习.异常;

public class AgeOutOfBoundsException extends RuntimeException{

    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
