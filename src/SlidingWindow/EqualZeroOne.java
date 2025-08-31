package SlidingWindow;

import java.util.Arrays;

public class EqualZeroOne {

    static int maxLen(int[] arr){

        //Longest Subarray With Equal Number of 0s and 1s

        int res = 0;
        int n = arr.length;

        for(int i=0; i < n; i++){

            for(int j=i; j < n; j++){

                int[] subArr = Arrays.copyOfRange(arr, i, j + 1);
                int zerr_count = 0;
                int one_count = 0;

                for(int k=0; k < subArr.length; k++){
                    if(subArr[k] == 0){
                        zerr_count += 1;
                    }
                    else{
                        one_count +=1;
                    }
                }

                if(zerr_count == one_count){
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        int op = maxLen(arr);
        System.out.println(op);

    }
}
