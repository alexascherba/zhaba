package Task2;

public class Main {
    public static void main() {
        Stock shop1 = new Stock();
        Stock shop2 = new Stock(55, 2.1);
        System.out.println("Cost of shop1 = " + shop1.cost() + ". cost shop2 = " + shop2.cost());
        System.out.println("Change shop1");
        shop1.changeAmountAndPrice(31, 1.1);
        System.out.println("Compare:");
        Stock.compareCost(shop1.cost(), shop2.cost());
        System.out.println("All amount = " + Stock.allAmount(shop1, shop2));
    }
}
