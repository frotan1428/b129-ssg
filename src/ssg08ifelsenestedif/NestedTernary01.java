package ssg08ifelsenestedif;

public class NestedTernary01 {
    public static void main(String[] args) {

      /*
         Enter the code to check the password
         If it has more than 8 characters, the first letter must be "i".
         If more than 8 characters, the first letter must be "K".
         Solve the problem using nested Tenrary
      */

        //length(), bir String da  karakter sayısını döndürür

        String pwd="iaby3fass";
        String isValid= (pwd.length()>8) ? (pwd.charAt(0)=='i' ? "i icin valid password" :"i cin Not Valid") :
                        ( pwd.charAt(0)=='K' ? "K icin valid password" :" K icin Not Valid");

        System.out.println(isValid);

    }
}
