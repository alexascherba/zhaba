public class Kitten extends Cat {
    double feedingTime;
    public Kitten (int m, String n, double w, int a, double f) {
        super (m, n, w, a);
        feedingTime = f;
    }
    public Kitten(Kitten ob) {
        super(ob);
        feedingTime = ob.feedingTime;
    }
    void show() {
        super.show();
        System.out.println("Time is " + feedingTime);
    }
}
