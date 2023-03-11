package ssg09swicth;

import java.util.Scanner;

public class Switch021 {
    // Gets the number of months from the user and prints the season.
    // create switch
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the month");
        String monthName=scan.next();
        switch (monthName){

            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Write");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;

            default:
                System.out.println("Please enter a valid month name");
        }
    }

}
