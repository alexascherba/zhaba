package org.example;

public class Consumer implements Runnable{

    private MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for(;;){
            myQueue.get();
        }
    }
}
