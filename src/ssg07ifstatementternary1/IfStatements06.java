package ssg07ifstatementternary1;

import java.util.Scanner;

public class IfStatements06 {
    public static void main(String[] args) {

        // Ask the user for age
        // You can retire if you are 65 or older
        // If you are under 65, you cannot retire the print

        Scanner scan = new Scanner(System.in);
        System.out.println("please Enter Your age :");
        int yas=scan.nextInt();


        if (yas>=65){
            System.out.println("You Can Retire ");
        } else {
            System.out.println("You Can Not Retire");
            System.out.println(65-yas + " need to work");
        }
      // in the if else statement, and only one of the two modes works
        // possibility to work both ====> none
        // possibility of both not working =====> none

    }
}
