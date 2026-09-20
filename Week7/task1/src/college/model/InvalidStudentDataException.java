package college.model;

public class InvalidStudentDataException extends RuntimeException {
    public InvalidStudentDataException(String message) {
        super(message);
    }
}
