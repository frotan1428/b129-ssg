package ssg12nestedloop;

public class NestedLoop03 {

    public static void main(String[] args) {

        //  Write the code that draws the figure below
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *


         */

        int input =5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }


        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }


        for (int i = 1; i <=input-1 ; i++) {
            for (int j = 1; j <=input-i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

//          for (int i =5; i >0 ; i--) {
//                    for (int j = 0; j < i; j++) {
//                        System.out.print("*"+ " ");
//
//                    }
//                    System.out.println();
//                }

    }
}
