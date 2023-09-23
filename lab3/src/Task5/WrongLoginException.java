package Task5;

public class WrongLoginException extends Exception{
    public WrongLoginException(String x) {
        super(x);
    }
    public WrongLoginException() {
        super();
    }
    public String toString() {
        return "Login is incorrect";
    }
}
