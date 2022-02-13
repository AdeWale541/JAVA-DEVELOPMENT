package Training1;
//DO LOOP
import java.util.Scanner;

public class Train7 {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);



        int num;
        int end = 13;

        // For addition
        int add = 0;
        int init = 1;

        //For multiplication
        System.out.print("What value do you want to find the multiple of?");
        int ans = text.nextInt();
        int mul;


        for (num = 1 ; num < end; num++){

            //For addition
            add = add + num;

            //For Multiplication
       mul = ans * num;
            System.out.println( ans + " * " + num + " = " + mul);

        }

        //Addition answer
       System.out.println("Addition from " + init + " to " +  end + " is equal to "  + add);

    }


}
