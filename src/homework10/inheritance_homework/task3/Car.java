package homework10.inheritance_homework.task3;

public class Car {
    private int passengerCount;
    private char engineType;

    /**
     * Getters and Setters for passengerCount and engineType
     * @return passengerCount, engineType
     */
    public int getPassengerCount(){
        return this.passengerCount;
    }
    public void setPassengerCount(int x){
        if(x>1){
            this.passengerCount = x;
        }else {
            this.passengerCount = 2;
            System.out.println("Passengers count could not be less than 2");
        }
    }
    public char getEngineType(){
        return this.engineType;
    }
    public void setEngineType(char a){
        if(Character.isLetter(a)){
            this.engineType = a;
        }else {
            this.engineType = 'A';
            System.out.println("Engine type must be letter");
        }
    }
    /**
     * Constructors for Car class
     */
    public Car(int passengerCount, char engineType){
        setPassengerCount(passengerCount);
        setEngineType(engineType);
    }
    public Car(int passengerCount){
        this(passengerCount, 'A');
    }
    public Car(char engineType){
        this(2, engineType);
    }
    public Car(){
        this(2, 'A');
    }

}
