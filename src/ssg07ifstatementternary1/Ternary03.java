package ssg07ifstatementternary1;

public class Ternary03 {
    public static void main(String[] args) {

        //Write a code to calculate the absolute value of a number
        //For positive numbers, the non-zero absolute value is the same number
        //To find the absolute value of negative numbers, multiply the number by -1
        double num = -1;
        double absoluteValue = num>0 ?  num : -1*num;
        System.out.println(absoluteValue);

    }
}
