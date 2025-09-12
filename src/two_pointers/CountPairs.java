package two_pointers;

import java.util.Arrays;
import java.util.HashMap;

public class CountPairs {

    static int countPairs(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;

        for(int i=0; i < n; i++){
            for(int j = i+1; j<n; j++){
                if(Math.abs(arr[j] - arr[i]) == k){
                    cnt+= 1;
                }
            }
        }
        return cnt;
    }

    static int countPairTwoPair(int[] arr, int k){
        Arrays.sort(arr);
        int left = 0, right = 1, count = 0;

        int n = arr.length;

        while(right < n){

            int diff = arr[right] - arr[left];

            if(diff == k){
                count++;
                left++;
                right++;
            }
            else if(diff < k){
                right++;
            }
            else{
                left++;
                if(left == right){
                    right++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args){

        int[] arr = {1, 4, 1, 4, 5};
        //[{1,4}, {1,4}, {4,1}, {1,4410}]
        int k = 3;
        System.out.print(countPairs(arr, k));

        System.out.print(countPairTwoPair(arr, k));


    }
    
}
