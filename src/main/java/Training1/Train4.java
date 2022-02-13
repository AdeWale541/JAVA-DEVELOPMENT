package Training1;

public class Train4 {
    public static void main(String[] args) {
        int user =48;

        if(user<=18){

            System.out.println("User is not more than 18 years old");

        }
//   &&(AND) ||(OR)  ==(HAS A VALUE OF) !(NOT)
        else if (user>18 && user<=40){

            System.out.println("User is greater than 18 but lesser than or equal 40");

        }

        else {
            System.out.println("User is greater than 40");
        }


    }


}