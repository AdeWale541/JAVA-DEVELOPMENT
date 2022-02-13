package Training3;
// CharAt- for isolating a character in a string

import java.util.Scanner;
public class Train8 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Do you want to quit, Y/N?");
        String ans = user_input.next();
        char achar = ans.charAt(0);
        // 0 is the first letter in the string. You can change 0 to any position in the string

        if (achar == 'Y'){
            System.out.println("Application is quitting");
        } else {
            System.out.println("Application is resuming");
        }
    }
}
