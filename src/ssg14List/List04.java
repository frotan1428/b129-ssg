package ssg14List;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    public static void main(String[] args) {

        // find the number of elements that are above average in a list

        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(3.0);
        numbers.add(5.0);
        numbers.add(3.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(1.0);
        numbers.add(7.0);

        //find  Average
        double average=0.0;
        double total=0.0;

        for (int i = 0; i <numbers.size() ; i++) {
            total+=numbers.get(i);
        }


        average= total / numbers.size();
        System.out.println(average); // 3.875

        //above average, throw a list

        List<Double> aboveAverage=new ArrayList<>();

        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i)>average){
                aboveAverage.add(numbers.get(i));
            }
        }
        System.out.println(aboveAverage);



    }
}
