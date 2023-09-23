package Task3;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit plum = new Plum();
        Fruit pear = new Pear();
        Fruit pear1 = new Pear();
        double sum = apple.price(1.5) + plum.price(0.6) + pear1.price(2) + pear.price(0.65);
        System.out.println("Общая стоимость проданных фруктов " + sum);
        System.out.println("Общая стоимость яблок " + apple.price(1.5));
        double pears = pear.price(0.65) + pear1.price(2);
        System.out.println("Общая стоимость груш " + pears);
        System.out.println("Общая стоимость слив " + plum.price(0.6));
    }
}
