package ifelsenestedif3;

public class NestedIf01 {

    public static void main(String[] args) {

        // bir kisinin kan bagisinda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali

        //Yaş ve kilo için iki değişken oluşturma
        int yas =17;
        int kilo= 50;


        if (yas>=18){

            if (kilo>=50){
                System.out.println("Kan bagisnida uygunsunuz");
            }else {
                System.out.println("Kan bagisnda uygun degilsiniz .");
            }
        }else{
            System.out.println("Yasiniz 18 'dan Buyuk Olmali");
        }

    }
}
