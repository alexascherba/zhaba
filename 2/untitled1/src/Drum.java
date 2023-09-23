public class Drum implements Instrument{
    int size;
    public Drum(int size) {this.size = size;}
    public void play() {
        System.out.println("Играет барабан с размером = " + size);
    }
}
