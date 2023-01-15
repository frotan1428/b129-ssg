package ssg15varargs;

public class Varargs04 {

    public static void main(String[] args) {

        // Kac tane ill ismi verilirse verilsin
        // iclerinden en Uzun olani yazdiran bir method olusturun
        String ill1 = "Adana";
        String ill2 = "ankara";
        String ill3 = "Istanbul";
        String ill4 = "Bursa";
        String ill5 = "cihan";

        enUzunIllIsim(ill1, ill2, ill3, ill4, ill5);
    }//main

    private static void enUzunIllIsim(String... str) {
        String enUzunIllIsmi="";

        for ( String w :str) {

            if(w.length() > enUzunIllIsmi.length()){
                enUzunIllIsmi=w;
            }
        }//foreach
        System.out.println("enKisaIllIsmi = " + enUzunIllIsmi);//Sahsanem

    }//method
}

