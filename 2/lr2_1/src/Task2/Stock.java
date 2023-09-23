package Task2;

public class Stock {
    int amount;
    double price;
    public Stock() {
        amount = 33;
        price = 2.7;
    }
    public Stock(int a, double p) {
        amount = a;
        price = p;
    }
    public void changeAmountAndPrice(int a, double p) {
        amount = a;
        price = p;
    }
    public double cost() {
        return amount*price;
    }
    static public void compareCost(double x, double y) {
        if (x > y) {
            System.out.println("First cost > second cost");
        } else if (x == y) {
            System.out.println("First cost = second cost");
        } else {
            System.out.println("First cost < second cost");
        }
    }
    static public int allAmount(Stock... arr) {
        int all = 0;
        for (Stock i : arr) all += i.amount;
        return all;
    }
}
