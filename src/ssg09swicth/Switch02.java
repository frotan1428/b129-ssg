package ssg09swicth;

import java.util.Scanner;

public class Switch02 {
    // Gets the number of months from the user and prints the season.
    // create switch
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a valid month Number");
        int monthNo=scan.nextInt();
        switch (monthNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Fall");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Please Enter a valid month Number");
        }
    }

}
