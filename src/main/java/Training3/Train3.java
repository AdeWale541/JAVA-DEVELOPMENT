package Training3;
// concat- editing strings
import java.util.Scanner;

public class Train3 {

    public static void main(String[] args) {
        String word = "Jav";
        String amend = word.concat("a");

        System.out.println(amend);

        Scanner user_input = new Scanner(System.in);

        System.out.println("The line above is pointless");

        System.out.print("What is your first name?");
        String first_name = user_input.next();

        System.out.print("What is your last/family name?");
        String family_name = user_input.next();

        family_name = family_name.toUpperCase();

        String fullName= "";

        fullName = fullName.concat(first_name).concat(",").concat(family_name);

        System.out.println("Your full name is " + fullName);

    }


}
