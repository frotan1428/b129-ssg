package ssg14List;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        //write all the elements of the given list on the screen.


    

        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(9);
        System.out.println(list); // [5, 7, 8, 6, 9]
        // Let's increment each element by 2 using for each

        List<Integer> list2= new ArrayList<>();
        for (Integer each: list) {
            list2.add(each=each+2);

        }
        System.out.println(list2);


    }


}

