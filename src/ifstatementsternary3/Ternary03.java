package ifstatementsternary3;

import java.util.Scanner;

public class Ternary03 {

    public static void main(String[] args) {

        //Bir tamsayı pozitifse "Tamsayı pozitiftir" yazdırın, aksi takdirde
        // "Tamsayı pozitif değil" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();


        String str=sayi>0 ? "Pozitif sayi" : "Negatif Sayi";
        System.out.println(str);
        System.out.println(sayi > 0 ? "tam sayi pozitif" : "tamsayi negtive ");

    }
}
