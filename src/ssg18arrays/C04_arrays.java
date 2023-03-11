package ssg18arrays;

public class C04_arrays {
    public static void main(String[] args) {
        /*
       Q4.  Create an integer array and  Find the sum of all elements.
        */

        // 1st way
        int num1[]={8,5,12,11,14};
        int sum=0;
        for (int i = 0; i <num1.length; i++) {
            sum+=num1[i];

        }
        System.out.println(sum);

        // 2nd way
        int total = 0;
        for (int w : num1){
            total+=w;
        }
        System.out.println(total);







    }
}
