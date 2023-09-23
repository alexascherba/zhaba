package Task5;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String x) {
        super(x);
    }
    public WrongPasswordException() {
        super();
    }
    public String toString() {
        return "Incorrect password";
    }
}
