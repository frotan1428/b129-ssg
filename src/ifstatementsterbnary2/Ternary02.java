package ifstatementsterbnary2;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim
        Scanner input =new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();

        if (sayi%2==0){
            System.out.println("CIFT");
        }else {
            System.out.println("TEK");
        }

        System.out.println(sayi%2==0 ? "CIFT" : "TEK");

        String result = sayi%2==0 ? "CIFT" : "TEK";
        System.out.println(result);



    }
}
