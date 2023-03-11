package ssg10forloop;

public class ForLoop09 {
    /*
     Write code to print integers from 3 to 9 excluding 5
      */
    public static void main(String[] args) {
        for (int i = 3; i <=9 ; i++) {
            if (i==5){
                continue;
            }else System.out.println(i+" ");

        }

    }


}
