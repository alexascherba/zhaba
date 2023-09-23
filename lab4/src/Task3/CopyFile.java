package Task3;
/*Напишите класс, который копирует содержимое из одного файла в
другой. Необходимо использовать классы BufferedReader, FileReader,
BufferedWriter, FileWriter.*/
import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("firstFile.txt"))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("secondFile.txt"))) {
                String str;
                while ((str = br.readLine()) != null) {
                    bufferedWriter.write(str);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}