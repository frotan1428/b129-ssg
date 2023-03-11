package ssg07ifstatementternary1;

public class Ternary04 {
    public static void main(String[] args) {

        /*

        Multiplication 2 integer number If both integers are positive,
       if one is negative and the other is positive, print  "I don't know how to multiply" */
        int a=12;
        int b=-5;
        //Note: If your ternary returns different data types for different scenarios,
        // do not create reserved area for the result, put it directly inside System.out.println().

        System.out.println(a>0 && b>0  ? a*b:"I do not to multiply");

    }
}
