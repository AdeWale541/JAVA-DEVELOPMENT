package Training3;

//Using Indexof
import java.util.Scanner;

public class Train5 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
     System.out.println("What is your email address?");
        String email = user_input.next();
        String dotcom = ".com";
        Character atsign = '@';

        int result, atsgn;
        atsgn = email.indexOf(atsign);

        result = email.indexOf(dotcom,atsgn);

System.out.println(result);
        if(result == -1) {

            System.out.println("The email is invalid");

        }else {
            System.out.println("The email is valid");
        }
    }

}
