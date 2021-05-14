package exceptions;

public class SearchError extends AssertionError {

    public SearchError (String message, Throwable cause) {
        super(message, cause);
    }
}
