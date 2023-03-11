package ssg20methodcreationandmethodoverloading;

public class MethodCreation02 {

  // Let's create a method that prints the string
    // create a method that says welcome
    // create a method that writes a  closing message


    // dear friends Welcome to our SSG lesson
    // Mr. Ali can
    // Divide two numbers
    //2
    //Thank you for choosing us

    public static void main(String[] args) {
        welcomeToSSGLessons();
        printFirstNameLastName("ali","Can");
    }


    public static void welcomePrint() {
        // System.out.println("Dear friends, Welcome to our SSG lesson");
    }
    private static void closingMethod() {
        System.out.println("Thank you for choosing us");
    }

    private static void printFirstNameLastName(String name,String lastName) {
         System.out.println(name+ " "+  lastName);
        System.out.println("Divided to Numbers :");
          Calcualator.divided(12,5);
          closingMethod();

    }

    public static void welcomeToSSGLessons() {
        System.out.println("Dear friends, Welcome to our SSG lesson");
        welcomePrint();


    }


// main method 


}
