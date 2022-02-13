package Training1;

import java.util.Scanner;

public class Train5 {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a value for your preferred natural number");
        String num = user_input.next();
// You can use "int num  = user_input.nextInt();" instead of converting from string to integer. This allows
        // you to input integers and not just strings
        int number = Integer.parseInt(num);

        switch (number) {
            case 1: case 2: case 3: case 4: case 5: case  6:
            System.out.println("Your number " + number + " is from 1 - 6");
            break;
            case 7: case 8: case 9: case 10: case 11: case  12:
                System.out.println("Your number " + number + " is from 7 - 12");
                break;
            default:
                System.out.println("Your number " + number + " is not between 1 - 12");

        }


    }


}
