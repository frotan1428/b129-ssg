package ssg13scope;

/*
 There 3 types of variable
1) instance variable
2)local variable
3)static Variable

What is the difference between instance variable and local variable?

1) An instance variable is defined for its class, and a local variable is defined for its method.
2) If you don't put the first value in the instance variable, it won't make any mistakes,
you can put it later, but Local variable
you need to put the first value.
*/
public class LocalVariableScope {

    void show()
    {

//variable declared inside a method has method level scope
        int x=10;
        System.out.println("The value of x is: "+x);
    }
    public static void main(String args[])
    {
        LocalVariableScope dc = new LocalVariableScope();
        dc.show();
    }


}
