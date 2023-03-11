package ssg06wrapperclassoperator;

public class WrpperClass01 {

    public static void main(String[] args) {


/*
  Wrapper Class
        They are Non-primitive data types.Non-Primitives have "values" and "methods".
        We can do many actions by using "methods", this is very useful.
        But primitives do not have any actions/methods with them.
        Java created a structure called Wrapper Class for primitive values and methods.

         Primitive            Wrapper
          byte     ==>        Byte
          short    ==>        Short
          int      ==>        Integer *****
          long     ==>        Long
          float    ==>        Float
          double   ==>        Double
          boolean  ==>        Boolean
          char     ==>        Character  *****

 */

        ////1)AutoBoxing: To convert "primitive data" to "wrapper class" of the primitive data
        char ch ='A';

        System.out.println(ch);

        Character wch=ch;
        System.out.println(wch);

        //2)Unboxing: To convert "wrapper class" to "primitive data" of the wrapper class
        Short ws= 34;

        int num1=26;
        Integer num2=num1;

        Short wsh=30;

        short sh =wsh;


        //Ex : short data type'inin en kucuk ve en buyuk degerini ekrana yazdirin

        System.out.println(Short.MIN_VALUE +" " +Short.MAX_VALUE);//-32768 32767




    }
}
