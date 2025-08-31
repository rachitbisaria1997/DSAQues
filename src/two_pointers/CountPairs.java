package two_pointers;

import java.util.HashMap;

public class CountPairs {

//    static int countPairs(int[] arr, int k){
//
//        int n = arr.length;
//        int count = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//    }

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

    public static void main(String[] args){

        int[] arr = {1, 4, 1, 4, 5};
        //[{1,4}, {1,4}, {4,1}, {1,4410}]
        int k = 3;
        System.out.print(countPairs(arr, k));

    }
    
}
