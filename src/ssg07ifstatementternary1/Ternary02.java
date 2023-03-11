package ssg07ifstatementternary1;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        // All operations with Ternary can also be done with if else
        // The reason for choosing TERNARY  is that the structure is simple and understandable
        // There is no complex code in ternary
        // can only be simple results or operations that get us to the result

        // Write a code that takes an integer from the user and prints it odd or even

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Positive Integer Number");
        int num1 = scan.nextInt();

        if (num1%2==0){
            System.out.println("number is  EVEN");
        } else {
            System.out.println("number is  ODD");
        }

        // 1st way
        String  result2= num1%2==0 ? "number is EVEN" : "number is ODD";
        System.out.println(result2);

        System.out.println(num1%2==0 ? "number is EVEN" : "number is ODD");

       // Write a code that takes an integer from the user and prints it odd or even
        // if the number is EVEN print SQUARE and Else CUBE
        int EvenOdd= num1%2==0 ? num1*num1 : num1*num1*num1;
        System.out.println(EvenOdd);



    }
}
