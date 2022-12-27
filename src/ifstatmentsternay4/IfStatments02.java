package ifstatmentsternay4;

import java.util.Scanner;

public class IfStatments02 {

    public static void main(String[] args) {


        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();


        if (sayi%2==0){
            System.out.println("CIFT");
        }


        if (sayi%2!=0){
            System.out.println("TEK");
        }

        if (sayi%2==0){
            System.out.println("CIFT");
        }else {
            System.out.println("TEK");
        }






    }
}
