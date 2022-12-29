package ifelsenestefif1;

public class NestedIf01 {

    public static void main(String[] args) {

        // bir kisinin kan bagisinda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali
        //Yaş ve kilo için iki değişken oluşturma

        int yas=17;
        int kilo = 40;

        if (yas>=18){

            if (kilo>=50){
                System.out.println("kan bagisnda bulunmayi uygunsunuz");
            }else {
                System.out.println("kan bagisnda bulunmayi uygun degilisiniz");
            }

        }else {
            System.out.println("yasiniz 18 den buyuk olmali");
        }



    }
}
