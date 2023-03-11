package ssg10forloop;

import java.util.Scanner;

public class ForLoop07 {
    public static void main(String[] args) {

    /*
    Write a Java program that multiplies the specified number from 1 to 10.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a integer  number");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);


        }
    }
}
