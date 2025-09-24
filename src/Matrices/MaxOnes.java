package Matrices;

public class MaxOnes {

    public static int rowWithMaxOnes(int mat[][]){

        int rows = mat.length;
        int cols = mat[0].length;
        int maxCount = Integer.MIN_VALUE;
        int ans = -1;

        for(int r=0; r < rows; r++){

            int count = 0;

            for(int c = 0; c < cols; c++){

                if(mat[r][c] == 1){
                    count += 1;
                    if(count > maxCount){
                        maxCount = count;
                        ans = r;
                    }
                }
                else {
                    count = 0;
                }

            }

        }
        return ans;
    }

    public static void main(String[] args){

        int mat[][] = { {0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        int ans = rowWithMaxOnes(mat);

        if(ans != -1){
            System.out.println("row with max ones is "+ ans);
        }
        else{
           System.out.println( "There is no row with max ones");
        }
    }

}
