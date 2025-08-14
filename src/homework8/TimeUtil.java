package homework8;


import java.time.*;
import java.util.Scanner;

public class TimeUtil {
    public static void main(String[] args) {
        //1 Use LocalDate.now() to print today’s date.
        System.out.println(LocalDate.now());
        //2
        System.out.println(parseDate("2025-12-31"));
        //3
        System.out.println(calculateAge("2007-09-08"));
        //4
        System.out.println(addDays(LocalDate.of(2023, 10, 1), 100));
        //5 Use LocalTime.now() to display the current system time.
        System.out.println(LocalTime.now());
        //6 Print the current time in Tokyo, New York, and Yerevan using ZonedDateTime.now(ZoneId.of(...)).
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Yerevan")));
        //7
        ZonedDateTime meetingTime = ZonedDateTime.of(2025, 7, 26, 14, 0, 0, 0, ZoneId.of("Asia/Yerevan"));
        System.out.println(convertMeetingTime(meetingTime, "Europe/London"));
        System.out.println(convertMeetingTime(meetingTime, "America/Los_Angeles"));
        //8
        LocalTime startTime = LocalTime.of(8, 0);
        LocalTime endTime = LocalTime.of(15, 45);
        System.out.println(timeDifference(startTime, endTime));
        //9
        System.out.println(checkWeekend());
        //10
        System.out.println(String.join("\n", printAvailableTimeZones()));

    }

    //2 Parse the string "2025-12-31" into a LocalDate object and print it.
    /**
     * Parses a date string in the format "yyyy-MM-dd" into a LocalDate object.
     *
     * @param dateString the date string to parse
     * @return the LocalDate object representing the date
     */
    public static LocalDate parseDate(String dateString) {
        return LocalDate.parse(dateString);
    }

    //3 Given your birthdate as a string (e.g., "2000-06-15"), calculate and
    // print your age in years using Period.between(...)

    /**
     * Calculates the age in years based on the provided date string.
     * @param dateString the birthdate in the format "yyyy-MM-dd"
     * @return the age in years
     */
    public static int calculateAge(String dateString) {
        LocalDate birthday = LocalDate.parse(dateString);
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today).getYears();
    }

    //4 Input  a date and add 100 days to it. Print the new date.
    /**
     * Adds a specified number of days to a given LocalDate.
     *
     * @param date the original date
     * @param days the number of days to add
     * @return the new LocalDate after adding the specified days
     */
    public static LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

    //7 You have a meeting at 2025-07-26T14:00 in Yerevan. Convert this time to London and Los Angeles time using ZonedDateTime.

    /**
     * Converts a meeting time in Yerevan to the specified time zone.
      * @param meetingDateTime the meeting time in Yerevan as a ZonedDateTime object
     * @param zoneId the ID of the target time zone (e.g., "Europe/London", "America/Los_Angeles")
     * @return the converted ZonedDateTime in the specified time zone
     */
    public static ZonedDateTime convertMeetingTime(ZonedDateTime meetingDateTime, String zoneId) {
        return meetingDateTime.withZoneSameInstant(ZoneId.of(zoneId));
     }

     //8 Given two LocalTime values (e.g., 08:00 and 15:45), calculate the time difference using Duration.between().

    /**
     * Calculates the time difference in minutes between two LocalTime values.
     * @param startTime the start time
     * @param endTime the end time
     * @return the time difference in minutes
     */
    public static int timeDifference(LocalTime startTime, LocalTime endTime) {
        return Duration.between(startTime, endTime).toMinutesPart() + Duration.between(startTime, endTime).toHoursPart() * 60;
    }

    //9 Ask the user to enter a date and tell whether it’s a Saturday or Sunday using getDayOfWeek().
    /**
     * Checks if the entered date is a weekend (Saturday or Sunday).
     * @return a message indicating whether the date is a weekend day or not
     */
    public static String checkWeekend(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return dayOfWeek + " is a weekend day.";
        } else {
            return dayOfWeek + " is not a weekend day.";
        }

    }

    //10 Print all available time zone IDs using ZoneId.getAvailableZoneIds().
    /**
     * Prints all available time zone IDs.
     * @return an array of available time zone IDs
     */
    public static String[] printAvailableTimeZones() {
        return ZoneId.getAvailableZoneIds().toArray(new String[0]);
    }





}
