package ssg12nestedloop;

public class NestedLoop01 {

    public static void main(String[] args) {

  /*
        soru 1)  Write the code that draws the figure below

                1
                * 2
                * * 3
                * * * 4
                * * * * 5
                */


        for (int line = 1; line <= 5; line++) {

            for (int i = 1; i <= line-1 ; i++) {
                System.out.print("* ");

            }
            System.out.println(line);

        }

    }
}
