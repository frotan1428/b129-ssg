package Helping_cahnel;

import java.util.Scanner;

public class UserNameNameHide {

    public static void main(String[] args) {

     createUserNamePassword();

    }
    public static void createUserNamePassword(){


        Scanner input = new Scanner(System.in);



        System.out.println("Please Enter your Name");
        String name =input.next();
         String encodeName= name.charAt(0)+""+ name.replaceAll("[A-Za-z]","*");

        System.out.println("Please Enter your UserName");
        String userName= input.next();
           String encodeUserName=   userName.charAt(0)+""+ userName.replaceAll("[A-Za-z]",
       "*");;
        System.out.println(encodeName +" "+ encodeUserName);


//        System.out.println("Please Enter your  password ");
//        String password= input.next();
//        if (password.length() >0 || password.length()<=16){
//            System.out.println(password);
//        }else {
//            System.out.println("password should 16 digit ");
//        }
//
//



    }
}
