package Training2;
//ARRAYS

import java.util.Arrays;
public class Train1 {
    public static void main(String[] args) {

        int[] arynums;

        int i;
        arynums = new int[6];
        //Or simply  int[] arr = new int[6];

        arynums [0] = 10;
        arynums [1] = 12;
        arynums [2] = 13;
        arynums [3] = 14;
        arynums [4] = 15;
        arynums [5] = 16;

        Arrays.sort(arynums);
        //System.out.println(arynums[2]);



        for (i=0; i<arynums.length;i++){

            System.out.println("num " + arynums[i]);
        }


    }

}
