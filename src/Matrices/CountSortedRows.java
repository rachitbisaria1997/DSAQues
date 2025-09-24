package Matrices;

import java.util.ArrayList;
import java.util.List;

public class CountSortedRows {

    static int sortedCount(int mat[][]){

        int rows = mat.length;
        int cols = mat[0].length;
        int res = 0;

        for(int r = 0; r < rows; r++){

            boolean inc = true;
            boolean dec = true;

            for(int c = 0; c < cols - 1; c++){

                if(mat[r][c] < mat[r][c + 1]){
                    dec = false;
                }

                if(mat[r][c] > mat[r][c + 1]){
                    inc = false;
                }

            }

            if(inc || dec){
                res++;
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int mat[][] = { { 1, 2, 3, 4, 5 },
                { 4, 3, 1, 2, 6 },
                { 8, 7, 6, 5, 4 },
                { 5, 7, 8, 9, 10 } };

        System.out.println(sortedCount(mat));

    }

}
