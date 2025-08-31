package SlidingWindow;

import java.util.*;

public class CountDistinct {

    static ArrayList<Integer> countDistinct(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        // Step 1: Process the first window
        for (int i = 0; i < k; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        res.add(freq.size());

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            // Remove element going out of the window
            int outgoing = arr[i - k];
            freq.put(outgoing, freq.get(outgoing) - 1);
            if (freq.get(outgoing) == 0) {
                freq.remove(outgoing);
            }

            // Add new element
            int incoming = arr[i];
            freq.put(incoming, freq.getOrDefault(incoming, 0) + 1);

            res.add(freq.size());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinct(arr, k)); // [3, 4, 4, 3]
    }


}
