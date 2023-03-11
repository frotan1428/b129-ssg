package ssg10forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        /*
       Question 4) print Numbers from 100 to 50 (inclusive)
          on the same line with commas between them.
         */
        int bas=100;
        int son=50;
        for (int i = bas; i >=son ; i--) {
            if (i>son){
                System.out.print(i+",");
            }else System.out.print(i);

        }


    }
}
