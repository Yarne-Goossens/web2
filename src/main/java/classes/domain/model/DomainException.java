package classes.domain.model;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}