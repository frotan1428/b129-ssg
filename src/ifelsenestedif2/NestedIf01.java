package ifelsenestedif2;

public class NestedIf01 {

    public static void main(String[] args) {

        // bir kisinin kan baginda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali

        //Yaş ve kilo için iki değişken oluşturma


        int yas =16;
        int kilo =50;

        if (yas>=18){
            if (kilo>=50){
                System.out.println("kan bagisinda bulunmayi uygunsunuz ");
            }else {
                System.out.println("kan bagisinda bulunmayi uygun degilsiniz ");
            }
        }else {
            System.out.println("yasiniz 18 'dan Buuk Olmali ");
        }


    }
}
