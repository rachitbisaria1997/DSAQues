package SlidingWindow;

import java.util.*;

public class first {

    static int maxSum(Integer[] arr, int k){

        int n = arr.length;
        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i < k; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+ 1);
        }
        res.add(freq.size());


        for(int i=k; i < n; i++){

            int outgoing = arr[i-k];
            freq.put(outgoing, freq.get(outgoing) - 1);

            if(freq.get(outgoing) == 0){
                freq.remove(outgoing);
            }

            int incoming = arr[i];
            freq.put(incoming, freq.getOrDefault(incoming, 0) + 1);

            res.add(freq.size());
        }

        return res.size();
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int ans = maxSum(arr, k);
        System.out.print(ans);
    }
}
