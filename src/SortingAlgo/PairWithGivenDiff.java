package SortingAlgo;

import java.util.Arrays;

public class PairWithGivenDiff {


    public static void main(String[] args) {
        int[] arr = {5, 20, 3, 2, 50, 80};
        int x = 78;
        if (findPair(arr, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean findPair(int[] arr, int x) {

        Arrays.sort(arr);
        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                if(Math.abs(arr[j] - arr[i]) == x) {
                    return true;
                }
            }
        }
        return false;
    }

}
