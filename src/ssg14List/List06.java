package ssg14List;

import java.util.Arrays;
import java.util.List;

public class List06 {

    public static void main(String[] args) {
        // Convert given array into list.

        String arr[]={"A" , "B" , "C"};
        List<String> arrayToList= Arrays.asList(arr);

        // When we convert a list from an array, we cannot change the length of the new list.
        // therefore executing methods such as add() , remove() , clear() with the new list
        // Exception occurs when we request

         arrayToList.add("J"); // UnsupportedOperationException
        System.out.println("19.line list :" + arrayToList);

        arr[1]="F";

        System.out.println("23.line Array : " + Arrays.toString(arr));
        System.out.println("24.line list :" + arrayToList);

        arrayToList.set(0,"Y");

        System.out.println("28.line Array : " + Arrays.toString(arr));
        System.out.println("29.line list :" + arrayToList);

    }
}
