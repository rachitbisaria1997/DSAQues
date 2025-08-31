package SlidingWindow;

public class LongsubArraySum {

    //Count of Subarrays with sum equals k

    static int longestSubArray(int[] arr, int k){
        int res = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n;j++) {

                sum += arr[j];

                if(sum == k){
                    res += 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){

        int[] arr = {1, 0, 1, 1, 0, 1};
        int k = 2;
        System.out.print(longestSubArray(arr, k));

    }
}
