public class Main {
    public static void main(String[] args) {
        Figure first = new Figure(3.5);
        Figure second = new Figure(3.4, 4.3);
        Figure third = new Figure(4);
        System.out.println(first.sq(5) + ", " + second.sq(3.4) + ", " + third.sq(3.3, 2.1));
    }
}