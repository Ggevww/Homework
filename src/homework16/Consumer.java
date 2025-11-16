package homework16;

public class Consumer extends Thread{
    public WareHouse w;
    public Consumer(WareHouse w){
        this.w = w;
    }
    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            try {
                w.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("consumed successfully");
        }
    }
}
