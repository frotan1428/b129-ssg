package ssg18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_arrays {
    /*
    Q8 Create an array by taking the size and all elements of an array from the user,

    */
    public static void main(String[] args) {
     createArray();
    }
    public static void createArray(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int length=scan.nextInt();
        int array[]=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println(i+". Enter a number for the value in the index");
            array[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        //return arrayolustur();
    }

}
