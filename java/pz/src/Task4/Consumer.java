package Task4;

public class Consumer implements Runnable {

    private MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        while (true) {
            myQueue.get();
        }
    }
}
