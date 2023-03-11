package ssg07ifstatementternary1;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {

        //Question 3) Get the day name from the user and print whether it is weekday or weekend
        // Example: day=Sunday output = “Weekend”
        // day=Tuesday output = “Weekday”
        // *** Use equals method for String

        // if sunday or saturday ===> weekend
        // if monday or tuesday or wednesday or thursday or friday ==> weekday

        Scanner scan= new Scanner(System.in);
        System.out.println("Please write the name of the day");
        String dayName=scan.next();

        if (dayName.equals("Saturday") || dayName.equals("Sunday")){
            System.out.println("Enter day is Weekend");
        } else {
            System.out.println("The day you entered, on the day of the week");
        }


    }
}
