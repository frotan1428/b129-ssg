package ssg07ifstatementternary1;

public class Ternary06 {
    public static void main(String[] args) {

        int number=1400;
        // Checks if the given number has 3 or more digits
        // and create a TERNARY  that prints the result

        String result = number>=100 ? "number of 3 digits or more" : "negative number or less than 3 digits";


        // Ternary  to give us the result
        // Or we should print this result directly
        // Or we can assign an appropriate variable for the result data type

        System.out.println("Analyze the number you entered: " + result);
    }
}
