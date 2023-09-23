import java.util.Scanner;

public class Cat extends Animals {
    int count;

    public Cat(int m, String n, double w, int a) {
        super (n, w, a);
        count = m;
    }
    public Cat(Cat ob) {
        super(ob);
        count = ob.count;
    }
    void show() {
        super.show();
        System.out.println("Caught mouses is " + count);
    }
    public void voice() {
        System.out.println("Mew");
    }
}
