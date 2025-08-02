package homework9.task4;

import java.time.*;
/** * A utility class to track the time since the initialization of the application.
 * It provides methods to get the current time and calculate the seconds elapsed since initialization.
 */
public class Time {
    public static final LocalDateTime initTime = LocalDateTime.now();


    /**
     * Returns the time since the application was initialized in seconds.
     *
     * @return the number of seconds since initialization
     */
    public static long getSecondsSinceInit() {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(initTime, now);
        return duration.getSeconds();
    }
}

/**
 * A test class to demonstrate the functionality of the Time class.
 */
class TestTime {
    public static void main(String[] args) {
        System.out.println("Initial Time: " + Time.initTime);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long secondsSinceInit = Time.getSecondsSinceInit();
        System.out.println("Seconds since initialization: " + secondsSinceInit);
    }
}