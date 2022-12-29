package ifelsenestedif3;

public class Ternary {

    public static void main(String[] args) {




        boolean A =true;
        boolean B=false;
        boolean C=false;
        boolean D= true;
        boolean E= true;
        boolean F= true;
        boolean G= false;

        boolean result = A ? B ? C : D : E ? F : G ;
        System.out.println(result);
    }
}
