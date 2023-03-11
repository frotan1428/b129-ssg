package ssg09swicth;

import java.util.Scanner;

public class Switch05 {
    public static void main(String[] args) {
        //write a program to check Vowel or Consonant letters in English:

        Scanner input = new Scanner(System.in);
        System.out.println("please Write an english character");
        char ch=input.next().toLowerCase().charAt(0);
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("=="  + ch + "=="  + " is an vowel letter : ");
                break;

                /*
                    case 'A':ß
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
               System.out.println("=="  + ch + "=="  + " is an vowel letter : ");
                break;
                 */

            default:
                System.out.println("-"  + ch + "-"  + " is a consonant letter  : ");
        }
    }
}
