package Exception;

public class AreaLimitException extends Exception {
    public AreaLimitException() {
        super("The remaining area does not meet the requirements. The addition is not done :(");
    }
}
