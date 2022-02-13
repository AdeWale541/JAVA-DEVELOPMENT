package Training1;
import java.util.Scanner;

public class Train6 {
        public static void main(String[] args) {

            System.out.println("Choose a colour between the 4; Black, White, Red, Blue,");

            Scanner text = new Scanner(System.in);


            String colo= text.next();

            if (colo.equals("Black")) {
                System.out.println("You must be a Goth");

            } else if (colo.equals("White")){
                System.out.println("You are a very pure person");

            } else if (colo.equals("Red") ){
                System.out.println("You are fun and outgoing");

            } else if (colo.equals("Blue")){
                System.out.println("You are not a Chelsea fan, are you?");

            } else {
                System.out.println("You chose a wrong colour. Read the instructions and choose again");

            }




        }

}
