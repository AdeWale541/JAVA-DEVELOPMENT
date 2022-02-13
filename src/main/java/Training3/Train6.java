package Training3;

import java.util.Scanner;
//SUBSTRINGS- swapping 2 letters in a name
public class Train6 {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("What is your full name?");
        String Full_name = user_input.nextLine();
        // Use .nextLine instead of .next if the space is important. The space is originally a white blank
        int spacesgn = Full_name.indexOf(" ");

        String fn_letter =  Full_name.substring(0,2);
        System.out.println("The first 2 first name letters are " + fn_letter);
        String fn_remlet = Full_name.substring(2, spacesgn);
        System.out.println("The remaining first name letters are " + fn_remlet);

        String ln_letter = Full_name.substring(spacesgn + 1, spacesgn + 3);
        System.out.println("The first 2 last name letters are " + ln_letter);
        String ln_remlet = Full_name.substring(spacesgn +3, Full_name.length() );
        System.out.println("The remaining last name letters are " + ln_remlet);

        String new_name = fn_letter + ln_remlet + " " + ln_letter + fn_remlet;
               System.out.println("Your new name is " + new_name);

    }
}
