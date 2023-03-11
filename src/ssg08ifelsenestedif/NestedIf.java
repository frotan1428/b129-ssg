package ssg08ifelsenestedif;

public class NestedIf {

    public static void main(String[] args) {
        // Check if a person is give blood or not .
        // Start from age: 18
        // Weight: must be over 50 // Create two variables for age and weight


        int age=25;
        int weight=58;
        //yaş ve kilo şartının uygulanması
        if(age>=18){

            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are  not eligible to donate blood");
            }
        } else{
            System.out.println("your age should  be greater then 18:");        }
    }
}

