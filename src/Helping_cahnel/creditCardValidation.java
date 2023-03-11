package Helping_cahnel;

import java.util.*;

public class creditCardValidation {
  public static boolean validation(long credit_number) {
    return (sizecheck(credit_number) == 16); //&&
        //(sumOfEven(credit_number)+sumOfOdd(credit_number)) % 10 == 0);
  }
  public static int sizecheck(long c_num) {
    String num = c_num+"";
    return num.length();
  }



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long credit_number;
    System.out.print("Enter credit card number: ");
    credit_number = sc.nextLong();
    Long encode=credit_number;
    String credit = encode.toString(credit_number);
    sc.close();
    System.out.println(credit_number + " is "+ (validation(credit_number) ? "valid":"invalid"));
    String strCardNumber = "11112222";
    String strReplacement = "**********";

    String newString = strReplacement + credit.substring(12);
    System.out.println(newString);



  }
}