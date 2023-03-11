package ssg10forloop;

public class ForLoop02 {

    public static void main(String[] args) {

/*
    Question 2) write a program Between 10 and 30 (including 10 and 30)
    print numbers on the same line with commas between them
     */
        int bas = 20;
        int son = 50;
        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i+",");

            }else
                System.out.print(i);


        }
    }
}
