package ifstatementsterbnary2;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();

        if (sayi%2==0){
            System.out.println("CIFT");
        }

        if (sayi%2!=0){
            System.out.println("Tek");
        }

        // if else
        if (sayi%2!=0){
            System.out.println("Tek");
        }else{
            System.out.println("CIFT");
        }



    }
}
