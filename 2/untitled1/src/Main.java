public class Main {
    public static void main(String[] args) {
        Drum drum = new Drum(5);
        Guitar guitar = new Guitar(6);
        Horn horn = new Horn(7);
        Instrument[] instruments = new Instrument[3];
        instruments[0] = drum;
        instruments[1] = guitar;
        instruments[2] = horn;
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}