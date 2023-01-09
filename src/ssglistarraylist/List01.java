package ssglistarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class List01 {

    public static void main(String[] args) {

         List<Integer>  list = new ArrayList<>();

//         List<Integer>  list2 = new ArrayList<Integer>();
//         ArrayList<Integer>  list3 = new ArrayList<>();
//         Collection<Integer> list4 = new ArrayList<Integer>();


        list.add(15);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        System.out.println(list);//[15, 17, 18, 19, 20]//  15 17 18 19 20

        for (Integer x:list){
            System.out.println(x);
        }


        System.out.println("====================");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }

        List<Integer> myList = List.of(12,13,14,15,16);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }
}
