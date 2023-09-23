package Task1;

public class Circle {
    double R, x, y;
    public Circle() {
        R = 3.5;
        x = 2.9;
        y = 6.7;
    }
    public Circle(double R) {
        this.R = R;
        x = 2.9;
        y = 6.7;
    }
    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        R = 3.5;
    }
    public Circle(double R, double x, double y) {
        this.R = R;
        this.x = x;
        this.y = y;
    }
    public void show() {
        System.out.println("R = " + R + ", x = " + x + ", y = " + y);
    }
    public void changeXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void changeR(double R) {
        this.R = R;
    }
    public double sq() {
        return Math.PI*R*R;
    }
    public double lengthCircle() {
        return 2*Math.PI*R;
    }
}
