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
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;
        longestSubArray(arr, k);
    }

}
