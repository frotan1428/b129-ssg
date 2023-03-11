package ssg14List;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("Aykut");
        names.add("Yusuf");
        names.add("Ilker");
        names.add("Oguzhan");
        System.out.println(names); // [Aykut, Yusuf, Ilker, Oguzhan]

        names.set(1,"Seckin"); // Yusuf gitti, yerine Seckin geldi
        System.out.println(names); // [Aykut, Seckin, Ilker, Oguzhan]

        // daha onceden listede var olanlari da arsiv gibi tutmak istersek
        List<String> logListesi=new ArrayList<>();

        logListesi.add(names.set(2,"Cosmos"));

        System.out.println(names); // [Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesi); // [Ilker]


        /// index
        List<Integer> numberList= new ArrayList<>();
        numberList.add(5); // [5]
        numberList.add(3); // [5, 3]
        numberList.add(0,7); // [7, 5, 3]
        numberList.add(2,7); // [7, 5, 7, 3]

            // to get element
        System.out.println(numberList.get(2)); // 7

        System.out.println(numberList); // [7, 5, 7, 3]



    }
}
