package Task3;

public class NewThread extends Thread{

    StringBuilder stringBuilder;

    public NewThread(StringBuilder stringBuilder){
        this.stringBuilder = stringBuilder;
    }

    public void run() {
        synchronized (stringBuilder){
            for (int i = 0; i < 100; i++){
                System.out.println(stringBuilder);
                char c = (char)(stringBuilder.charAt(0) + 1);
                stringBuilder.setCharAt(0, c);
            }

        }
    }
}
