package Task3;

public class Plum extends Fruit{
    public double price(double weight) {
        return weight * 7.1;
    }
    public void printManufacturerInfo() {
        System.out.println("Made in PL");
    }
}