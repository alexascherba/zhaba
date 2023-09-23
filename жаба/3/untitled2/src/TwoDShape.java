public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    public TwoDShape() {
        width = height = 0.0;
        name = "null";
    }
    public  TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    public TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }
    public TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }
    public void setWidth(double w) {
        width = w;
    }
    public void setHeight(double h) {
        height = h;
    }
    public void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
    public abstract double area();
}
