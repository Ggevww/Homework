package homework16;

public class ThreadIssues {
    static void main() {
        WareHouse wareHouse = new WareHouse();


        Producer  p1 = new Producer(wareHouse);
        Producer  p2 = new Producer(wareHouse);

        Consumer  c1 = new Consumer (wareHouse);
        Consumer  c2 = new Consumer (wareHouse);

        p1.start(); p2.start(); c1.start(); c2.start();

    }

}
