package Task4;

import java.io.*;
/*Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов,
а также процесс восстановления в дальнейшем из этих байтов "живых" объектов.*/

public class SerializeAnimal {
    private static final String FILE_NAME = "horses.dat";

    public static void main(String[] args) {
        serialize();

        Animal horse = deserialize();
        System.out.println(horse);
    }

    private static Animal deserialize() {
        Animal animal = null;
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);

            animal = (Horse) ois.readObject();

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return animal;
    }

    private static void serialize() {
        Animal horse1 = new Horse(64, 78, "Арабская", 25);
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
              ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse1);
            System.out.println(horse1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
