package homework10.inheritance_homework.task3;

public class Truck extends Car {
    private int capacity;

    /**
     * Getter and Setter for capacity
     * @return capacity
     */
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        if(capacity>=0){
            this.capacity = capacity;
        }else {
            System.out.println("Capacity must be 0 or positive");
            this.capacity = 0;
        }
    }
    /**
     * Constructors for Truck class
     */
    public Truck(int capacity, int passengerCount, char engineType) {
        super(passengerCount, engineType);
        setCapacity(capacity);

    }
    public Truck(int capacity, int passengerCount) {
        this(capacity, passengerCount, 'A');
    }
    public Truck(int capacity, char engineType) {
        this(capacity, 2, engineType);
    }
    public Truck(int capacity) {
        this(capacity, 2, 'A');
    }
    public Truck() {
        this(0, 2, 'A');
    }

}
