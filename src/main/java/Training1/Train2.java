package Training1;


import java.util.Scanner;


public class Train2 {



    public static void main(String[] args){

        Scanner user_input = new Scanner( System.in);
        System.out.print("Enter your first name; ");
        String first_Name = user_input.next();


        System.out.print("Enter your Last name; ");
        String family_Name = user_input.next();

        String full_Name = first_Name + " " + family_Name;

        System.out.print("Your full name is " + full_Name);



    }

}
