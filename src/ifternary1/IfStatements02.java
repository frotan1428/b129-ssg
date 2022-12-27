package ifternary1;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen tmsayi giriniz");
        int sayi= input.nextInt();

        if (sayi%2==0){
            System.out.println("girilen sayi cift saydir");
        }

        if (sayi%2!=0){
            System.out.println("girilen sayi tek saydir");
        }
        // if else

        if (sayi%2!=0){
            System.out.println("girilen sayi tek saydir");
        }else{
            System.out.println("girlien sayi cift dir");
        }


    }
}
