public class Triangle extends TwoDShape{
    private String style;
    public Triangle() {
        super();
        style = "null";
    }
    public Triangle(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }
    public Triangle(double x) {
        super(x, "triangle");
        style = "isosceles";
    }
    public Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }
    public  double area() {
        return getWidth()*getHeight() / 2;
    }
    public void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
