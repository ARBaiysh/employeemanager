package tesh.getarrays.emploeemanaget.exception;


public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String employeeRepository) {
        super(employeeRepository);
    }
}
