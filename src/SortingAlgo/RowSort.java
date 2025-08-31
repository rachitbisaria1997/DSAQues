package SortingAlgo;
import java.util.Arrays;

public class RowSort {

    public static void sortRows(int[][] mat){

        for(int[] row : mat){
            Arrays.sort(row);
        }

    }

    public static void main(String[] args) {

        int[][] mat = {
                {77, 11, 22, 3},
                {11, 89, 1, 12},
                {32, 11, 56, 7},
                {11, 22, 44, 33}
        };

        sortRows(mat);

        System.out.println("[");

        for(int[] row : mat){

            System.out.print("  [");

        }
    }

}
