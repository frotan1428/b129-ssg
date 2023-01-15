package ssg15varargs;

public class NoVarargs01 {

      /*
        Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
        Method'un parantezleri icine yazilanlara "parametre" denir
        Method'u cagirirken kullanilan sayilara da "argument" denir.

        Note 1: Bir method'da 1 den fazla Varargs Parametre kullanilamaz cunku ikincisi "Unreachable Code" olur.
        Note 2: "Varargs", Varargas disindaki parametrelerle kullanilabilir ama "Varargs" her zaman "son parametre" olmalidir
     */

       /*
        1) Bir metotta parametre sayısını esnek hale getirmek istiyorsanız, "varargs" kullanın.
        2) Varargs oluşturmak için "Veri Tipi + ... + boşluk + varargslar için bir isim"
        3) "Varargs", arkasında Array kullanır. Varargs ile çalışırken Array ile çalıştığınızı düşünebilirsiniz.
        4) "Varargs" sıfır veya daha fazla öğe kabul edebilir
        5)"Varargs"dan sonra başka bir normal parametre kullanabilir miyim?
        Hayır, "Varargs" tam yapılamayacağı için ikinci parametreye ulaşılamayacak, hata verecektir.
        "Varargs" her zaman son parametre olmalıdır.

        6)"Varargs"dan önce başka bir normal parametre kullanabilir miyim?
        Evet, "Varargs" dan önce birçok normal parametre kullanabilirsiniz.

        7)Bir metotta birden fazla "Varargs" parametresi kullanabilir miyim?
                Hayir .Cunku sondaki Varargs'a unreachable code olur
                */

    public static void main(String[] args) {
        addFourNumbers(3, 5,5,6);
        multiplyTowNumber(4, 7);

    }

    //4 sayiyi toplayan method olusturunuz
    public static void addFourNumbers(int a, int b ,int c,int d){
        System.out.println(a+b+c+d);
    }

    //iki sayiyi carpimi  method olusturunuz
    public static void multiplyTowNumber(int a, int b){
        System.out.println(a*b);
    }


}
