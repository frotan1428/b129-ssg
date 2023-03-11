package ssg20methodcreationandmethodoverloading;

public class MethodOverLoading {
    public static void main(String[] args) {

        // create a method that adds and prints the two given numbers

        int number1=10;
        int number2 =20;

        addTwoNumber(number1, number2);

        // create a method that prints the sum of two double numbers

        double number3=15.2;
        double number4=10.3;

        addTwoNumber(number3,number4);

        // if I make a method call by writing the numbers directly without creating a variable

        addTwoNumber(15,25); // returns int sum
        addTwoNumber(10.1,12.3); // returns a double sum

        // create a method that prints the sum of an integer and a double

        int number5=3;
        double number6=3.2;

        addTwoNumber(number5,number6);// int and double
        addTwoNumber(number6,number5);// double and integer



        //

    }
    private static void addTwoNumber(int number3, double number4) {

        System.out.println("sum of an integer a double : " + (number3 + number4) );
    }

    private static void addTwoNumber(double number3, int number4) {

        System.out.println("sum of an double a integer : " + (number3 + number4) );
    }

    private static void addTwoNumber(double number3, double number4) {

        System.out.println("sum of two doubles : " + (number3 + number4) );
    }

    private static void addTwoNumber(int number1, int number2) {

        System.out.println("sum of two integers: " + (number1+number2));
    }
}
