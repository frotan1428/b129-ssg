package ssg11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop03 {
    public static void main(String[] args) {


        // ask from how many number  wants to add .
        // get these numbers and print the sum of these numbers on console



        Scanner scan = new Scanner(System.in);


        // while ile yapalim
        System.out.println("How many numbers do you want to sum?");
        int countNumber=scan.nextInt();
        int number=0;
        int toplam=0;
        int conuter=1;

        while (conuter<=countNumber){
            System.out.println(conuter + " : please Enter number :");
            number= scan.nextInt();
            toplam+=number;
            conuter++;
        }
        System.out.println("enter  "+ countNumber + "number the total is:  : " + toplam);



    }
}
