package ssg09swicth;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        // get the number of months from the user
        // write a program that prints the desired month name on console.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the month name");
        int monthNo=scan.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi guc olabilir
        // bunun yerine switch - case yapisini kullanabiliriz

        if (monthNo == 1) {
            System.out.println("January");
        } else if (monthNo==2){
            System.out.println("February");
        }else if (monthNo==3){
            System.out.println("March");
        }else if (monthNo==4){
            System.out.println("April");
        }else if (monthNo==5){
            System.out.println("May");
        }else if (monthNo==6){
            System.out.println("June");
        }else if (monthNo==7){
            System.out.println("July");
        }else if (monthNo==8){
            System.out.println("August");
        }else if (monthNo==9){
            System.out.println("September");
        }else if (monthNo==10){
            System.out.println("October");
        }else if (monthNo==11){
            System.out.println("November");
        }else if (monthNo==12){
            System.out.println("December");
        }else {
            System.out.println("Please enter a valid month number");
        }

        switch (monthNo){

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please enter a valid month number");
        }

        // switch icine yazilan variable'in degerine gore
        // ilgili case'i bulur ve break gorene kadar kodu calistirir
        // eger break yoksa ilgili case'den asagi dogru tum case'ler calisir
        // if else'deki son else gibi, geriye kalan durumlari tamamen
        // kapsayacak bir satir daha ekleyebiliriz

         /*

        Note: In Switch method  parenthesis you can use Just the following data types
        a)int  b)byte   c)short  d)String
        Note: In Switch method  parenthesis you can not use Just the following data types
        a)long  b)double   c)float  d)boolean
         */


    }
}
