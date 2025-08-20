package homework11.task1;

public class Weekend {
    public String getDayType(Day day) {
        if(day.ordinal()>=0 && day.ordinal()<5) {
            return "Weekday";
        } else if(day.ordinal() == 5 || day.ordinal() == 6) {
            return "Weekend";
        } else {
            return "Invalid day";
        }
    }

    public static void main(String[] args) {
        Weekend weekend = new Weekend();
        for (Day day : Day.values()) {
            System.out.println(day.getDayName() + " is a " + weekend.getDayType(day));
        }
    }
}
