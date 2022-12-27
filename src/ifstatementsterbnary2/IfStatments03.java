package ifstatementsterbnary2;

import java.util.Scanner;

public class IfStatments03 {

    public static void main(String[] args) {
    //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
            // 	Ornek:  	gun=Pazar output = “Hafta sonu”
            //		gun=Sali output = “Hafta ici”
            //	*** String icin equals method’unu kullanin

        Scanner input =new Scanner(System.in);
        System.out.println("lufen gunIsmi girniz");
        String gunIsmi = input.next().toLowerCase();

        if (gunIsmi.equals("pazar")|| gunIsmi.equals("cumartesi")){
            System.out.println("HaftaSounu");
        }else{
            System.out.println("HaftaIci");
        }


        if (gunIsmi.equals("pazartesi")||
        gunIsmi.equals("sali")||
        gunIsmi.equals("carsemebe")||
        gunIsmi.equals("persmebe")||
        gunIsmi.equals("cuma")){
            System.out.println("HaftaIci");
        }else {
            System.out.println("Hafatasonu");
        }

    }
}
