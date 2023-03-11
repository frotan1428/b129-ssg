package ssg12nestedloop;

public class NestedLoop02 {

    public static void main(String[] args) {

        /*


        Soru 2 ) Ask the user to enter a positive number and according to the entered number
                draw the figure below

         *
         * *
         * * *
         * * * *
         * * * * *

        // nested for loop can be either rectangular or triangle format
         When we want a rectangular , we  can specify the outer loop end point for the inner loop end point.
        To give a triangle shape, we make the end point of the inner loop depend on the outer loop initial  variable.

       */

        // OUTER   INNER

        int input =6;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }



        System.out.println("===============");

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input; j++) {

                System.out.print("* ");

            }
            System.out.println("");

        }

       /*
       Ask the user to enter a positive number and according to the entered number
                draw the figure below

        1
        22
        333
        4444
        55555

        */


        for (int i = 1; i <=5; i++) {


            for (int j = 1; j <=i; j++) {

                System.out.print(j+ " ");

            }
            System.out.println();

        }











    }
}
