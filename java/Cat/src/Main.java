import java.io.*;



public class Main {
    private  static final String FILE_NAME = "testSer.ser";
    public static void main(String[] args) {
        serialize();
        Cat cat = deserialize();

    }

    private static Cat deserialize() {
        Cat cat = null;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            cat = (Cat) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return cat;
    }

    private static void serialize() {
        Cat cat = new Cat("Barsic");
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(cat);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}