package co.com.sofka.exceptions.tempconvert;

public class ValidationIsNotNumeric extends AssertionError {
    public static final String VALIDATION_IS_NOT_NUMERIC = "The entered value is not numeric. %s";

    public ValidationIsNotNumeric(String message, Throwable cause){
        super(message, cause);
    }
}
