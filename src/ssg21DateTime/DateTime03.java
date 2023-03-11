package ssg21DateTime;

import java.time.LocalTime;

public class DateTime03 {
    public static void main(String[] args) {

        LocalTime before= LocalTime.now();
        System.out.println(before); // 21:10:01.017511

        // if we want to find out how long a transaction takes
        // create a time object before and after the operation
        // we can calculate the difference
        int number=0;
        for (int i = 0; i < 100000 ; i++) {
            number+=i;
        }
        System.out.println("Total Number 1- 1000000 : "+ number);
        LocalTime after= LocalTime.now();
        System.out.println(after); // 21:14:01.922778800

        double nano1=before.getNano();
        double nano2=after.getNano();

        System.out.println("operation " + (nano2-nano1) + " done in nanoseconds");


        // If we want, we can create an object for the time of the zone we want using zone id.
    }
}
