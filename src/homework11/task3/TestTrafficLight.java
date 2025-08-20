package homework11.task3;

public class TestTrafficLight {
    public static void main(String[] args) {
        TrafficLight currentLight = TrafficLight.RED;

        for (int i = 0; i < 10; i++) {
            System.out.println("Current light: " + currentLight);
            currentLight = currentLight.getNextLight();
        }
    }
}
