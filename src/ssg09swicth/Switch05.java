package ssg09swicth;

import java.util.Scanner;

public class Switch05 {
    public static void main(String[] args) {
        //ingilizce de Ünlü veya Ünsüz harflerini kontrol etmek için bit program yaziniz:

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir ingilizce harfi yaziniz");
        char ch=input.next().toLowerCase().charAt(0);
        switch(ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
//            case 'A':
//                System.out.println("Vowel");
//                break;
//            case 'E':
//                System.out.println("Vowel");
//                break;
//            case 'I':
//                System.out.println("Vowel");
//                break;
//            case 'O':
//                System.out.println("Vowel");
//                break;
//            case 'U':
//                System.out.println("Vowel");
//                break;
            default:
                System.out.println("Consonant");
        }
    }
}
