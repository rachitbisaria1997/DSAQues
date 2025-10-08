package Arrays;

import java.util.Arrays;

public class MaxProductArray {

    public static int maxProduct(int [] arr){
        int maxProduct =Integer.MIN_VALUE;

        for(int i=0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

                int prod = 1;
                int[] subArr = Arrays.copyOfRange(arr, i, j );
                for(int k : subArr){
                    prod *= k;
                }

                maxProduct = Math.max(maxProduct, prod);
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};
        int val = maxProduct(arr);
        System.out.println(val);

        int [] arr1 = {1,5,0};
        System.out.println(maxProduct(arr1));
    }

}
