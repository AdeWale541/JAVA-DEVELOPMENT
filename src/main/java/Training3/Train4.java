package Training3;
//Generating a random number

import java.util.concurrent.ThreadLocalRandom;
public class Train4 {
    public static void main(String[] args) {

        int random = ThreadLocalRandom.current().nextInt(1,30);
        System.out.print(random);


    }

}
