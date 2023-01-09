package ssglistarraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        // verilen bir array'i listeye cevirin
            String arr[]={"A" , "B" , "C"};

        System.out.println(Arrays.toString(arr));

     // ArrayList<String>  arraydenlist =

        // 1 yol
        List<String> yenilist=new ArrayList<>();
        for (String w:arr){
            yenilist.add(w);
        }

        System.out.println(yenilist);//[A, B, C]

        // 2 yol
        List<String> arraydenList = Arrays.asList(arr);
        System.out.println(arraydenList);


        // 3 yol
        List<String>  list3 = new ArrayList<>(List.of(arr));

        System.out.println(list3);




    }
}
