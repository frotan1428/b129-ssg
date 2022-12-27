package ifternary1;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {
       // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen tmsayi giriniz");
        int sayi= input.nextInt();
        // 1 yol
        if (sayi%2==0){
            System.out.println("sayi cift");
        } else {
            System.out.println("sayi tek");
        }
        // 2.yol
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

        // 3. yol

        String sayi5 = sayi%2==0 ? "sayi cift" : "sayi tek";
        System.out.println(sayi5);



    }
}
