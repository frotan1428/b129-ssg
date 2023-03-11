package ssg14List;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        // Write program to print unique element fro list.
        // with Method
        // ex : [1, 3, 5, 3, 5, 6, 1, 7]  original list
        //       [1, 3, 5, 6, 7] output

        List<Integer> Numbers = new ArrayList<>();
        Numbers.add(1);
        Numbers.add(3);
        Numbers.add(5);
        Numbers.add(3);
        Numbers.add(5);
        Numbers.add(6);
        Numbers.add(1);
        Numbers.add(7);
        System.out.println(CreateUniqueList(Numbers));

    }

    public static List<Integer> CreateUniqueList (List<Integer> sayilar) {

        List<Integer> uniqueList = new LinkedList<>();
        for (int i = 0; i <sayilar.size() ; i++) {

            if (!uniqueList.contains(sayilar.get(i))){
                uniqueList.add(sayilar.get(i));
            }
        }
        return uniqueList;
    }
}
