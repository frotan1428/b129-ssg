package ssg19PassByValuePassByRefrence;

public class PassValueByReference {


        /*
         *  The original value of 'a' will be changed as we are trying
         *  to pass the objects. Objects are passed by reference.
         */

        int a = 10;

        public static void main(String[] args) {

            PassValueByReference pass = new PassValueByReference();
            System.out.println("Before call-by-reference: " + pass.a);

            // passing the object as a value using pass-by-reference
            pass.call(pass);
            System.out.println("After call-by-reference: " + pass.a);


        }

    void call(PassValueByReference pass) {
        pass.a = pass.a+10;
    }

}
