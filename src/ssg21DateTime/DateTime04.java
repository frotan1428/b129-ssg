package ssg21DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime04 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // assigns the date the object was created to trh
        System.out.println(date); // 2022-03-31
        LocalDate anotherDate=LocalDate.of(1972,1,18);
        System.out.println(anotherDate);
        // creates an object for us according to the year, month and day values we want
        // We can get detailed information about the date with the get methods
        System.out.println(date.getDayOfMonth()); // 31
        System.out.println(date.getDayOfWeek()); // THURSDAY
        System.out.println(date.getMonthValue()); // 3
        System.out.println(date.getYear()); // 2022

        // we can go as far back or forward from a date as we want

        System.out.println(date.minusWeeks(20)); // 2021-11-11
        System.out.println(date.minusWeeks(5).minusDays(3)); // 2022-02-21

        System.out.println(date.plusMonths(9).plusDays(10)); // 2023-01-10

        // If we want to get the current date of the country we want
        LocalDate dateZone= LocalDate.now(ZoneId.of("Europe/Paris")); //Europe/Istanbul
        System.out.println(dateZone); // 2022-04-01

        LocalTime myObj2 = LocalTime.now(ZoneId.of("Europe/Istanbul")); // Create a date object
        System.out.println(myObj2); // Display the current date



    }
}
