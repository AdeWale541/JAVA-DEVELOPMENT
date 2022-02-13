package Training3;
//REPLACE METHOD
import java.util.Scanner;
public class Train9 {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Kindly type out a sentence");
        String sent = user_input.nextLine();
        sent = sent.trim();
   // The trim command is to remove white spaces.


        System.out.print("Did you make an error?");
        String err_confirm = user_input.nextLine();
        err_confirm= err_confirm.trim();

        if (err_confirm.equals("yes")){
// Keep in mind that for strings, you cannot use ==. This only works for Boolean and Integer vriables
            System.out.print("Kindly type out the error made");
            String error = user_input.nextLine();
            System.out.print("Kindly type out the word to replace the error");
            String correction = user_input.nextLine();

            String amend = sent.replace(error, correction);

            System.out.println("Your amended sentence is '" + amend + "'");

        } else {
            System.out.print("Your sentence '" + sent + "' has been noted" );
        }

  }
}
