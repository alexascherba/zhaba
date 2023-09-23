package Task3;

public class Pear  extends Fruit{
    public double price(double weight) {
        return weight * 8.9;
    }
    public void printManufacturerInfo() {
        System.out.println("Made in Brazil");
    }
}