package Matrices;

import java.sql.SQLSyntaxErrorException;

public class FindMaxElem {

    static int[] maxELem(int [][] mat){

        int rows = mat.length;
        int cols = mat[0].length;

        int[] res = new int[rows];
        int k = 0;

        for(int r = 0; r < rows; r++){

            int maxElem = Integer.MIN_VALUE;

            for(int c = 0; c < cols; c++){

                if(mat[r][c] > maxElem){
                    maxElem = mat[r][c];
                }

            }
            res[k++] = maxElem;
        }


        return res;
    }

    static int[] maxElemCol(int [][] mat){

        int rows = mat.length;
        int cols = mat[0].length;

        int[] res = new int[rows];
        int k = 0;

        for(int c = 0; c < cols; c++){

            int maxElem = Integer.MIN_VALUE;

            for(int r = 0; r < rows; r++){

                if(mat[r][c] > maxElem){
                    maxElem = mat[r][c];
                }
            }
            res[k++] = maxElem;
        }

        return res;
    }

    public static void main(String [] args){

        int[][] mat = {
                {3, 4, 1, 8},
                {1, 4, 9, 11},
                {76, 34, 21, 1},
                {2, 1, 4, 5}
        };
        int[] res = maxELem(mat);

        for (int x : res) {
            System.out.print(x + "  ");
        }

        System.out.println();

        int[] res1 = maxElemCol(mat);
        for(int l : res1){
            System.out.print(l + "  ");
        }
    }
}
