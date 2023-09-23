import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue<T>{
    private Queue<T> queue = new ArrayDeque<>();
    private boolean valueSet = false;

    public synchronized T get(){
        System.out.println(Thread.currentThread().getName());
        while(!valueSet){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(queue.poll().toString());
        valueSet = false;
        notify();
        return null;
    }

    public synchronized void put(T t){
        while(valueSet){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        queue.add(t);
        valueSet = true;
        notify();
    }
}