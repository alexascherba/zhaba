public class Figure {
    public double a, b;
    public Figure (double a) {
        this.a = a;
    }
    public Figure (double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Figure (int a) {
        this.a = a;
    }
    public double sq (double a) {
        return a*a;
    }
    public int sq (int a) {
        return (int) (Math.PI*(a*a));
    }
    public double sq (double a, double b) {
        return a*b;
    }
}
