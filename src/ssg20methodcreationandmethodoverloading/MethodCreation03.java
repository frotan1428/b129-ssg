package ssg20methodcreationandmethodoverloading;

public class MethodCreation03 {
    public static void main(String[] args) {


        //Ask the user; his/her  name and  surname
        //then print on the same line with a space line between  and get credit card
        //       name : M*****
        //       lastName : B*******
        //       Credit Card  Number : **** **** **** 1234
        //
        String name = "Ali";
        String lastName= "Can";
        String kKNo="1234567890128795";


        String hideFirstNameLastName= hideNameLastName(name,lastName);
        System.out.println(hideFirstNameLastName); //

        // 1 yol
         // String gizlenmisKKNo=krediKartiGizle(kKNo);
         //  System.out.println(gizlenmisKKNo);

        //2. yol
        System.out.println(hideCreditCard(kKNo));

    }

    public static String hideNameLastName(String name, String lastName) {
        String newName = name.substring(0,1).toUpperCase()+
                name.substring(1).replaceAll("\\S","*");

        String newLastName= lastName.substring(0,1).toUpperCase()+
                lastName.substring(1).replaceAll("\\S","*");

        return newName+" "+newLastName;
    }

    private static String hideCreditCard(String creditNo) {
        String newCreditNo= "**** **** **** " + creditNo.substring(12);
        return newCreditNo;
    }
}
