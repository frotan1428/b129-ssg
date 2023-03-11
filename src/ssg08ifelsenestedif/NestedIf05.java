package ssg08ifelsenestedif;

import java.util.Scanner;

public class NestedIf05 {
    public static void main(String[] args) {
        // If a working woman is over 60 years old, she can retire.
        // If a man is working, if he is over 65 years old, he can retire

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your gender" +
                "\nF for female \nenter letter M for male");
        char gender=scan.next().toUpperCase().charAt(0);

        System.out.println("Please enter your age");
        int age=scan.nextInt();


        if (gender=='F'){

            if (age<0 || age>120){
                System.out.println("Please check the entered age");
            } else if (age < 60) {
                System.out.println("You can't retire\nYou have to work more  "+ (6-age) + "years");
            }else{
                System.out.println("You may retire");
            }

        } else if(gender=='M'){
            if (age<0 || age>120){
                System.out.println("Please check the entered age");
            } else if(age <65){
                System.out.println("You can't retire\nYou have to work more"+ (65-age) + "years");
            }else{
                System.out.println("You may retire");
            }

        }else {

            System.out.println("Please enter a valid letter for gender");
        }
    }
}
