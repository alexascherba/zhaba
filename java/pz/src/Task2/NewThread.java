package Task2;

public class NewThread extends Thread{

    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("a");
        }
    }
}
