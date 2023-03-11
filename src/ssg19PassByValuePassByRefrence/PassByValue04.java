package ssg19PassByValuePassByRefrence;

public class
PassByValue04 {
    public static void main(String[] args) {


        // create a method to increase watch price 20 percent;

     double increase =   increaseWatchPrice(2000);
        System.out.println(increase);

      int abs =  getAbsoluteValue(8);
        System.out.println(abs);

    }

    public  static double increaseWatchPrice(double increase){
         return increase*1.2;
    }


    //// create a method to fet absolute value of a number  ex: -6==6, 7==7 0==0;

    public static int getAbsoluteValue(int a){
       return a< 0 ? -1*a :a;
    }

}
