package ifternary1;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiniz gun hafatasonu");
        }else{
            System.out.println("girdiniz gun hafatasIci");
        }


        if (gunIsmi.equals(gunIsmi.equals("pazartesi")) ||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsemebe")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma")){
            System.out.println("girdiniz gun hafatasIci");
        }
    }
}
