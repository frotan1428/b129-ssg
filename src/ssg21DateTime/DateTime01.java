package ssg21DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime01 {
    public static void main(String[] args) {

        // --------  Type code to  Display Current Date  ---------
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        // --------  Type code to  Display Current Time  ---------
        LocalTime myObj2 = LocalTime.now(); // Create a date object
        System.out.println(myObj2); // Display the current date



        // --------  Type code to     Display Current Date and Time ---------
        LocalDateTime myObj3 = LocalDateTime.now(); // Create a date object
        System.out.println(myObj3); // Display the current date

       // Formatting Date and Time





    }
}
