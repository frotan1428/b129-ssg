package ifelsenestefif1;

public class IfElse01 {

    public static void main(String[] args) {

        //Gündüz dersimiz varsa katılabilirim
        //Gece sınıfımız varsa ona da  katılabilirim

        boolean dt =false;
        boolean nt =false;

        boolean isActiveMi = dt || nt;

        // && ||

        if (isActiveMi){
            System.out.println("sinifa katilabilirsiniz");
        }else{
            System.out.println("sinifa kattilamiyorum");
        }
    }
}
