public class Horn implements Instrument{
    int d;
    public Horn(int d) {this.d = d;}
    public void play() {
        System.out.println("Играет труба с диаметром " + d);
    }
}
