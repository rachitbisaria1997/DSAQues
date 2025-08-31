package Arrays;
import java.util.*;


public class LarPairSum {

    static int findLargestSumPair(List<Integer> arr){

        int maxSum = Integer.MIN_VALUE;
        int n = arr.size();

        for(int i = 0; i < n - 1; i++){

            for(int j = i + 1; j < n; j++){

                int sum = arr.get(0) + arr.get(j);
                if(sum > maxSum){
                    maxSum = sum;
                }

            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 34, 10, 6, 40);
        System.out.println("Max Pair Sum is " + findLargestSumPair(arr));
    }
}
