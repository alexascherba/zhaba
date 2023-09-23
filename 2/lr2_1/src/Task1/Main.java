package Task1;

public class Main {
    public static void main() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.9);
        Circle circle3 = new Circle(2.1, 9.3);
        Circle circle4 = new Circle(1.1, 2.2, 3.3);
        System.out.println("Circles:");
        circle1.show();
        circle2.show();
        circle3.show();
        circle4.show();
        System.out.println();
        System.out.println("Change x, y for circle3:" );
        circle3.changeXY(9.9, 9.9);
        circle3.show();
        System.out.println();
        System.out.println("Change R for circle3:" );
        circle3.changeR(9.9);
        circle3.show();
        System.out.println();
        System.out.println("S = " + circle3.sq() + ", l = " + circle3.lengthCircle());
    }
}
