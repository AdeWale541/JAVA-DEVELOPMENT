package Training2;
//MULTI-DIMENSIONAL ARRAYS

import java.util.Arrays;

public class Train4 {

    public static void main(String[] args) {

        int[][] multiarr = new int[6][6];
//multiarr[row][column]
        multiarr[0][0] = 10;
        multiarr[0][1] = 12;
        multiarr[0][2] = 43;
        multiarr[0][3] = 11;
        multiarr[0][4] = 22;
        multiarr[0][5] = 01;

        multiarr[1][0] = 20;
        multiarr[1][1] = 22;
        multiarr[1][2] = 53;
        multiarr[1][3] = 21;
        multiarr[1][4] = 32;
        multiarr[1][5] = 11;

        multiarr[2][0] = 30;
        multiarr[2][1] = 32;
        multiarr[2][2] = 63;
        multiarr[2][3] = 31;
        multiarr[2][4] = 42;
        multiarr[2][5] = 21;

        multiarr[3][0] = 40;
        multiarr[3][1] = 42;
        multiarr[3][2] = 73;
        multiarr[3][3] = 41;
        multiarr[3][4] = 52;
        multiarr[3][5] = 31;

        multiarr[4][0] = 50;
        multiarr[4][1] = 52;
        multiarr[4][2] = 83;
        multiarr[4][3] = 51;
        multiarr[4][4] = 62;
        multiarr[4][5] = 41;

        multiarr[5][0] = 60;
        multiarr[5][1] = 62;
        multiarr[5][2] = 93;
        multiarr[5][3] = 61;
        multiarr[5][4] = 72;
        multiarr[5][5] = 51;

        int rows = 6;
        int columns = 6;
        int i, j;


        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print("  " + multiarr[i][j]);

            }
            System.out.println("  ");

        }
    }
}
