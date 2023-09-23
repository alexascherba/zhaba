package Task6;

public class NumberValues implements Runnable{
    public static void main(String[] args) {
        NumberValues numberValues = new NumberValues();

        Thread thread1 = new Thread(numberValues);
        thread1.setName("Первый поток");
        Thread thread2 = new Thread(numberValues);
        thread2.setName("Второй поток");
        Thread thread3 = new Thread(numberValues);
        thread3.setName("Третий поток");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0){
                System.out.println("Начало выполнения " +
                        Thread.currentThread().getName() + " " + i);
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }

        }
    }
}
