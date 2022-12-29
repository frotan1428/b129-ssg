package ifelsenestedif2;

public class IfElse01 {
    public static void main(String[] args) {

        //Gündüz dersimiz varsa katılabilirim

        //Gece sınıfımız varsa ona da  katılabilirim


        boolean dt =false;
        boolean nt=false;
        boolean isActiveMi=dt ||  nt;

        if (isActiveMi){
            System.out.println("sinifa katilabilirim");

        }else{
            System.out.println("sinifa katlamazsiniz");
        }

    }
}
