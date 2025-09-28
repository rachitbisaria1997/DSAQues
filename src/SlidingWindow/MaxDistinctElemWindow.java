package SlidingWindow;

import java.util.*;

public class MaxDistinctElemWindow {

    static int maxSum(int[] arr, int k){

        List<Integer> al = new ArrayList<>();

        for(int i=0; i < arr.length; i++){

            int length = 0;
            Set<Integer> set = new HashSet<>();
            for(int j = i; j < arr.length; j++){
                set.clear();
                length++;
                if(length == k){

                    int[] subArr = Arrays.copyOfRange(arr, i, j + 1);

                    for(int x : subArr){
                        set.add(x);
                    }
                    al.add(set.size());
                }
            }
        }
        //find the max distinct elements in any window
        return al.stream().max(Integer::compare).get();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int ans = maxSum(arr, k);
        System.out.print(ans);
    }
}
