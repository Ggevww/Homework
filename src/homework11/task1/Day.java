package homework11.task1;

/**
 * Enum representing the days of the week.
 */
public enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String dayName;

    Day(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }

}

