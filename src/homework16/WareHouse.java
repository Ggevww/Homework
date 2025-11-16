package homework16;

import java.util.ArrayDeque;
import java.util.Queue;

public class WareHouse {
    final int capacity = 20;
    Queue<String> wareHouse = new ArrayDeque<>(capacity);
    public synchronized void produce(String item) throws InterruptedException {
        while(wareHouse.size() == capacity){
            System.out.println("queue is full");
            Thread.sleep(1000);
            System.out.println("waiting.....");
            wait();
        }
        wareHouse.add(item);
        notifyAll();
    }
    public synchronized void consume() throws InterruptedException {
        while(wareHouse.isEmpty()){
            System.out.println("queue is empty");
            Thread.sleep(1000);
            System.out.println("waiting.....");
            wait();
        }
        System.out.println(wareHouse.poll());
        notifyAll();
    }


}
