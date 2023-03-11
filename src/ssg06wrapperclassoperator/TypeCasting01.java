package ssg06wrapperclassoperator;

public class TypeCasting01 {

    public static void main(String[] args) {

        /*
    1)Primitive Data Types ==>
    byte < short < int < long < float < double ==>numaric primitive data types

     boolean==> true or false
     char  ==> for a single data
     */

    /*
    1) AutoWidening

        Java can put small data types into large dat types automatically
        When you put small data type object into a large data type object,
        you are widening the small dat type.

         */

        int m= 14;

        double d =m;
        System.out.println(d);

    /*
    2)Explicitly Narrowing
    Java does not put large data types into small data types automatically.
    Java thinks this is risky.



     */
        int n= 20;
        byte b=(byte) n;

        System.out.println(b);
    }

}
