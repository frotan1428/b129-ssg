package ssg20methodcreationandmethodoverloading;

public class MethodCreation01 {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        /*
                How to create a method in Java?
                1) Created outside  the main method
                2)Access Modifier + Return Type + Method Name + () + {}

                How are the created methods used?
                1) It is used from inside the main method
                2) type the name of the method + ()
                3) Put the numbers you want to operate in parentheses
         */


        // Let's create a method that collects the value of two variables
        // Step 1: Write the name of the method
        // Step 2: Is there any argument I need to send to the method?

          addTwoNumber(a,b);

          // stattic method
        Calcualator cal=new Calcualator();
        Calcualator.Subtraction(3,6);
        Calcualator.divided(12,6);

    }


    private static void  addTwoNumber(int a, int b) {
        System.out.println("Sum of two given numbers: " + (a+b));
    }


}
