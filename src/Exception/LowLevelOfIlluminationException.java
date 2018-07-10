package Exception;

public class LowLevelOfIlluminationException extends Exception{
    public LowLevelOfIlluminationException() {
        super("The illumination level should be higher 300 lx. Please add some illumination.");
    }
}
