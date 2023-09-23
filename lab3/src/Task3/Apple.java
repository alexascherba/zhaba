package Task3;

public class Apple extends Fruit{
    public double price(double weight) {
        return weight * 2.9;
    }
    public void printManufacturerInfo() {
        super.printManufacturerInfo();
    }
}