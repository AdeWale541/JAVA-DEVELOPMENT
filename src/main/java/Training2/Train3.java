package Training2;

import java.util.Arrays;

public class Train3 {
    public static void main(String[] args) {

    String[] arystring;

    int i;
    arystring = new String[5];
    //Or simply  String[] arystring = new String[5];

    arystring [0] = "This";
    arystring [1] = "is";
    arystring [2] = "a";
    arystring [3] = "String";
    arystring [4] = "Array";


    Arrays.sort( arystring);
    //System.out.println(arynums[2]);



    for (i=0; i< arystring.length;i++){

        System.out.println( arystring[i]);
    }


}

}

