

public class Producer implements Runnable{

    private MyQueue myQueue;
    private static int i = 0;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            myQueue.put(new String("Object: " + i));
        }
    }
}
