package ssg12nestedloop;

public class NestedLoop {

    public static void main(String[] args) {

        // Write a program that prints the below figure without a nested loop.
        /*

                * * * * *
                * * * * *
                * * * * *
                * * * * *
                * * * * *

           

         */
        System.out.println("========= 1 . method  without nested loop");
        for (int i = 1; i <=5; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();

        System.out.println("========= 2 . method  with nested loop");
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*" + " ");
            for (int j = 1; j <=4 ; j++) {

                System.out.print("*" +" ");

            }
            System.out.println();


        }

    }
}
