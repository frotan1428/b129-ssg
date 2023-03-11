package ssg11whileloopdowhileloop;

public class WhileLoop01 {

    public static void main(String[] args) {
        // Get a number from the user and
        // print the dividing numbers of this number and the total number on the screen


        int input=6;

        // for loop ile de yapabiliriz ama biz
        // while loop ile yapalim

        int divided=1;
        int counter=0;

        while(divided<=input){

            if (input % divided == 0){
                System.out.print(divided + " ");
                counter++;
            }
            divided++;
        }
        System.out.println("");
        System.out.println("there are " + counter + " numbers "  +input+ " is  dividing" );


    }
}
