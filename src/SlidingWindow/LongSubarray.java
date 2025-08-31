package SlidingWindow;

public class LongSubarray {

    static void longestSubArray(int[] arr, int k){

        // Longest Subarray With Sum Divisible By K

        int res = 0;
        int n =  arr.length;

        for(int i=0; i < n; i++){
            int sum = 0;
            for(int j=i; j < n; j++){
                sum += arr[j];
                if(sum % k == 0){
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0};
        int k = 4;
        longestSubArray(arr, k);
    }

}
