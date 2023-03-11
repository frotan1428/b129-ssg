package ssg18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_arrays {
    public static void main(String[] args) {
        /*
       6. Checking if a given array contains a desired element,
        Create a method that returns true or false.
        */

        String arr[]={"Italy","Germany","Unite State","England"};


         contains(arr);

    }
    public static boolean contains(String [] arr){
        boolean resultValue=false;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter country name");
        String searchCountry=scan.nextLine();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equalsIgnoreCase(searchCountry)){
                resultValue=true;
            }
        }

        if (resultValue){
            System.out.println("The country you are looking for is  exists");
        } else
            System.out.println("The country you are looking for is not found");

        return resultValue;


    }





}
