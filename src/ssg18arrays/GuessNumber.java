package ssg18arrays;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // Select  a number between 1 and 100 to the computer
        // ask the user to guess this number
        // guide the user to large or small the number in each guess entered
        // when the user finds the number, print to the user how many guesses he found the number
        //50   60  40

        // sara 7  kaya mehmet 6


        Random rnd = new Random();
       // System.out.println(rnd);

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a number ");
        int number =rnd.nextInt(40,50);
        System.out.println(number);
        int counter=0;
        int guess=0;


        while (number!=guess){ //4!=4

            guess=scan.nextInt();
            if (guess>number){
                System.out.println("Please enter a small Number");
            } else if (guess<number) {
                System.out.println("Please Enter a large Number");
            }
            counter++;
        }

        System.out.println("You find the my number " +counter + " Guessed  ");




    }
}
