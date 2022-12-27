package ifstatementsternary3;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {


        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gunIsimi giriniz");
        String gunIsimi= scan.next().toLowerCase();


        if (gunIsimi.equals("pazar")|| gunIsimi.equals("cumartesi")){
            System.out.println("hafatSonu");
        }else{
            System.out.println("HaftaIci");
        }

        if (gunIsimi.equals("pazartesi")||
        gunIsimi.equals("sali")||
        gunIsimi.equals("carsembe")||
        gunIsimi.equals("persmebe")||
        gunIsimi.equals("cuma")){
            System.out.println("HaftaIci");
        }else {
            System.out.println("hafatSonu");
        }


    }
}
