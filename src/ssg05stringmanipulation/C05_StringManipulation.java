package ssg05stringmanipulation;

public class C05_StringManipulation {

        public static void main(String[] args) {
            // Question 2) Find the sum of the following prices given as a string
            // String str1 = “$13.99”
            // String str2 = “$10.55”
            // hint: You can use the Double.parseDouble() method.

            String str1="$13.99";
            String str2="$10.55";

            str1=str1.replaceAll("\\D",""); // 1399  ama String olarak
            str2=str2.replaceAll("\\D",""); // 1055  ama String olarak

            double str1Sayi= Double.parseDouble(str1);
            double str2Sayi= Double.parseDouble(str2);

            double result= (str1Sayi+ str2Sayi)/100;

            System.out.println("sum of given String numbers: $"  + result );
        }

}
