package ssg15varargs;

public class Varargs02 {


    public static void main(String args[]){

        display();//zero argument
        display("hello");//one argument
        System.out.println();
        display("my","name","is","Ali Can");//four arguments
    }

    static void display(String... values){
        for(String s:values){
            System.out.print(s+ " ");
        }
    }

}
