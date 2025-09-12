package Matrices;

import java.util.HashSet;
import java.util.Set;

public class TwoDArray {

    public static boolean isValidMatrix(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i < rows; i++){
            Set<Integer> rset = new HashSet<>();

            for(int j=0; j < cols; j++){

                if(rset.contains(matrix[i][j])){
                    return false;
                }
                rset.add(matrix[i][j]);
            }
        }

        for(int j=0; j < cols; j++){
            Set<Integer> cset = new HashSet<>();

            for(int i = 0; i < rows; i++){

                if(cset.contains(matrix[i][j])){
                    return false;
                }
                cset.add(matrix[i][j]);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2, 2},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(isValidMatrix(matrix1));
        System.out.println(isValidMatrix(matrix2));


    }
}
