package ssg15varargs;

public class Varargs01 {


    //varargs stand for variables arguments
    //... means varargs.
    public static void main(String[] args) {

        add();//0
        add(5);//5
        add(5,10);//15
        add(5,10,15);//30

    }
    //Not1: You can not use any other parameters after varargs.
    //Not2: You can  use any other parameters except varargs before varargs.
    //Not3 : Varargs must be last parameter everytime.
    //Not4:  You can use just a single varargs in a method parenthesis.

    public static void add(int...a){
        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        System.out.println(sum);
    }
}
