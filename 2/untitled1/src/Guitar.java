public class Guitar implements Instrument{
    int numStrings;
    public Guitar(int numStrings) {this.numStrings = numStrings;}
    public void play() {
        System.out.println("Играет гитара с количеством струн = " + numStrings);
    }
}
