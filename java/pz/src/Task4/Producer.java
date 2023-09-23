package Task4;

public class Producer implements Runnable{

    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        for(int i = 0; i < 100; i++){
            myQueue.put(new String("Object: " + i));
        }
    }
}
