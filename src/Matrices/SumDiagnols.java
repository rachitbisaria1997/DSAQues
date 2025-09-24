package Matrices;

public class SumDiagnols
{

    public static int sumDiagnols(int mat[][]){

        int n = mat.length;
        int m = mat[0].length;
        int count = 0;

        for(int r = 0; r < n; r++){
            for(int c = 0; c < m; c++){

                if(r == c){
                    count += mat[r][c];
                }
            }
        }
        return count;
    }

    public static void main(String[] args){

        int mat[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {1, 2, 3, 4},
            {5, 6, 7, 8}};

        System.out.println(sumDiagnols(mat));

    }

}
