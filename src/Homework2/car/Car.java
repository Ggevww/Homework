package Homework2.car;

public class Car {
    char model;
    int modelNumber;
    String color;
    int currentSpeed;
    boolean isEngineStart;
    public Car(char model, int modelNumber, String color){
        this.model = model;
        this.modelNumber = modelNumber;
        this.color = color;
    }
    public void startEngine(){
        this.isEngineStart = true;
        System.out.println("Engine is working");
    }
    public void stopEngine(){
        this.isEngineStart = false;
        System.out.println("Engine is not working");
    }

    public static void main(String[] args) {
        Car mercedes1 = new Car('C', 203, "Black");
        Car mercedes2 = new Car('S', 505, "White");
        mercedes1.startEngine();
        mercedes2.startEngine();
        mercedes2.stopEngine();
    }

}
