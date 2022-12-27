package ifstatementsternary3;

public class Ternary01 {
    public static void main(String[] args) {

        // verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        // 100'den kucukse " sayi 100'den buyuk olmali" yazdiran
        // bir ternary olusturalim


        int sayi=120;

        Object num= sayi >100 ? sayi*sayi : "sayi 100'den buyuk olmali";
        System.out.println(num);

        System.out.println(sayi >100 ? sayi*sayi : "sayi 100'den buyuk olmali");

       int num2 = sayi >100 ? sayi*sayi : sayi*sayi*sayi;

        System.out.println(num2);



    }

}
