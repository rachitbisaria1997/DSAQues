package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SumMinMax {

    //Sum of minimum and maximum elements of all subarrays of size k

    static int SumOfKsubArray(int[] arr, int N, int k) {
        // To store the final answer
        int sum = 0;

        // Find all subarrays
        for (int i = 0; i < N; i++) {
            // To store the length of the subarray
            int length = 0;
            for (int j = i; j < N; j++) {
                // Increment the length
                length++;

                // When there is a subarray of size k
                if (length == k) {
                    // To store the maximum and minimum element
                    int maxi = Integer.MIN_VALUE;
                    int mini = Integer.MAX_VALUE;

                    for (int m = i; m <= j; m++) {
                        // Find the maximum and minimum element
                        maxi = Math.max(maxi, arr[m]);
                        mini = Math.min(mini, arr[m]);
                    }

                    // Add the maximum and minimum element to the sum
                    sum += maxi + mini;
                }
            }
        }
        return sum;
    }


    public static void main(String[] args){

        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int n = arr.length;
        int k = 4;

        System.out.println(SumOfKsubArray(arr, n, k));

    }

}
