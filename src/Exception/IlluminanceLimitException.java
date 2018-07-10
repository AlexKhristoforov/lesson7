package Exception;

public class IlluminanceLimitException extends Exception{
    public IlluminanceLimitException() {
        super("The illumination level does not meet the requirements. The addition is not done :(");
    }
}
