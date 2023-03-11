package ssg18arrays;

public class C05_arrays {
    public static void main(String[] args) {
        /*
        Q5 Create a method that prints the largest number in a given int array.
        */
        int numbers[]={8,5,12,11,14};

       findMaxNumberINArray(numbers);


    }
    public static void findMaxNumberINArray(int [] num){
        int maxNum=num[0];

//    int numbers[]={8,5,12,11,14};

        for (int i = 1; i < num.length; i++) {

            if (num[i]>maxNum){
                maxNum=num[i];
            }
        }
        System.out.println(maxNum);

    }




}
