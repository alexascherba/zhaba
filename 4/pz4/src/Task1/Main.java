package Task1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public void copyFile(String sourceFile, String destinationFile) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(sourceFile));
            writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully!");
        } catch (Exception e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } catch (Exception e) {
                System.out.println("An error occurred while closing the resources: " + e.getMessage());
            }
        }
    }

    public static void main() {
        Main copier = new Main();
        copier.copyFile("source.txt", "destination.txt");
    }
}
