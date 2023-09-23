import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\alex_\\Desktop\\жаба\\pz4_1\\First file.txt"))){
            String str;
            while ((str = bufferedReader.readLine()) != null){
                arr.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\alex_\\Desktop\\жаба\\pz4_1\\Second file.txt"))){
            for(String count : arr){
                bufferedWriter.write(count);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}