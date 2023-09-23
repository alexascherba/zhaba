package Test;

public class DeadlockRisk implements Runnable {
    private static class Resource {
    }
    private final Resource scissors = new Resource();
    private final Resource paper = new Resource();
    public void doSun() {
        synchronized (scissors) {
            System.out.println(Thread.currentThread().getName() + " взял ножницы для вырезания рамки");
            synchronized (paper) {
                System.out.println(Thread.currentThread().getName() + " взял бумагу для вырезания рамки");
                System.out.println(Thread.currentThread().getName() + " вырезает рамку");
            }
        }

    }
    public void doCloud() {
        synchronized (paper) {
            System.out.println(Thread.currentThread().getName() + " взял бумагу для вырезания фото");
            synchronized (scissors) {
                System.out.println(Thread.currentThread().getName() + " взял ножницы для вырезания фото");
                System.out.println(Thread.currentThread().getName() + " вырезает фото");

            }
        }
    }
    public void run() {
        doSun();
        doCloud();
    }
    public static void main( String[] args ) {
        DeadlockRisk job = new DeadlockRisk();
        Thread Givi = new Thread(job, "Гиви");
        Thread Fedor = new Thread(job, "Федор");
        Givi.start();
        Fedor.start();
    }
}
