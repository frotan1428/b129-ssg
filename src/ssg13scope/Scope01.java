package ssg13scope;

public class Scope01 {
  public static int  x=12;
  public int y=15;

    public static void main(String[] args) {
        System.out.println(x);
        Scope01.getNumber();

    }

    public static void getNumber(){
        System.out.println(x);

    }

}
