package ua.com.alevel.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String text) {
        super(text);
    }
}
