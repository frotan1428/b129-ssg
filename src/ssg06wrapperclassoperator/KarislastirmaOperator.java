package ssg06wrapperclassoperator;

public class KarislastirmaOperator {

    public static void main(String[] args) {

        System.out.println(5+2==8);//F

        boolean reslut= 5>4 && 7<9 && 6+3==9 && 5+2!=8 ;//T



        System.out.println(reslut);

        boolean result2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8 ;//F


        System.out.println(reslut);

        boolean reult3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8 ;//F




        System.out.println(reult3);


    }
}
