package homework16;

public class Producer extends Thread {
    public WareHouse w;
    public Producer(WareHouse w){
        this.w = w;
    }
    int counter = 0;
    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            try {
                w.produce("hello" +  counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
            System.out.println("produced successfully");
        }
    }

}
