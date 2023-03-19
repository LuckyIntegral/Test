package ua.com.alevel.exception;

public class UnsupportableEntityException extends RuntimeException {
    public UnsupportableEntityException(String text) {
        super(text);
    }
}
