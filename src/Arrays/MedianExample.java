package Arrays;

import java.util.Arrays;

public class MedianExample {

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 6, 2, 5, 7};

        System.out.println("Median = " + findMedian(arr));
    }

    static double findMedian(int[] arr){
        Arrays.sort(arr); // Step 1: Sort the array

        int n = arr.length;

        if (n % 2 != 0) {
            // odd length → return middle element
            return arr[n / 2];
        } else {
            // even length → average of middle two
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        }
    }

}
