package Training3;
//EQUALS METHOD
import java.util.Scanner;
public class Train7 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("What is your email address?");
        String email_add = user_input.next();
        String email_orig = "kameelakano@gmail.com";

        // match = false;

        Boolean match = email_add.equals(email_orig);
        // Equals method can't be used for Integers
        // To use on integers, you convert int to an object with the code;
        // int num = 12;
        //Integer num = new Integer(num)

        if (match == true) {
            System.out.println("Email has been taken");
        } else {
            System.out.println("Email is accepted");
        }



    }




}
