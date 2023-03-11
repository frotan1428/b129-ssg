package ssg18arrays;

import java.util.Arrays;

public class C06_arrays {
    public static void main(String[] args) {
        /*
        6.Soru -write a  method that prints the longest and shortest Strings in a given String array.
        */
        String arr[]={"Istanbul","ankara","adana","eski sehir"};

        LongestAndShortest(arr);


    }
    public static void LongestAndShortest(String[]arr){
        String min=arr[0];
        String max=arr[0];


        for (int i = 1; i < arr.length ; i++) {

            if (arr[i].length()>max.length()){
                max=arr[i];

            }
            if (arr[i].length()< min.length()){
                min=arr[i];
            }

        }

        System.out.println("Shortest word in Array: "+min);
        System.out.println("The longest word in the array: "+max);




    }





}
