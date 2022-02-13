package Training3;
//Compare strings
public class Train2 {

    public static void main(String[] args) {

        String word1 = "Ape";
        String word2= "App";

        int result;

        result = word1.compareTo(word2);
// This code essentially calculates the hexadecimal value for the 2 words and does word 1 - word 2
        // USe compareToIgnoreCase whem comparing words while ignoring the cases
        if (result < 0){

            System.out.println("Word 1 is less than word 2");
        } else if (result >0) {
            System.out.println("Word 1 is higher than word 2");
        } else if( result ==0){

            System.out.println("Words are the same");
        }

    }
}
