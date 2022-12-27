package ifstatementsternary3;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();


        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        if (sayi%2==0){
            System.out.println("CIFT");
        }else {
            System.out.println("TEK");
        }

        String str = sayi%2==0 ? "Cift Sayi" :"Tek Sayi";
        System.out.println(str);

        System.out.println(sayi%2==0 ? "Cift Sayi" :"Tek Sayi");



    }
}
