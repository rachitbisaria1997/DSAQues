package two_pointers;

import java.util.Arrays;

public class AbsDiff {

    public static void findAbsPairCount(int[] arr, int k) {
        int count = 0;
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[j] - arr[i]) == k) {
                    count++;
                }
            }
        }
        System.out.println("Brute Force Count: " + count);
    }

    public static void usingTwoPair(int[] arr, int k) {
        Arrays.sort(arr);
        int l = 0, r = 1;
        int count = 0;

        while (r < arr.length) {
            int diff = arr[r] - arr[l];

            if (diff == k) {
                count++;
                l++;
                r++;
            } else if (diff > k) {
                l++;
            } else { // diff < k
                r++;
            }

            if (l == r) { // keep r ahead
                r++;
            }
        }
        System.out.println("Two Pointer Count: " + count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 5};
        int k = 3;

        findAbsPairCount(arr, k);
        usingTwoPair(arr, k);
    }
}
