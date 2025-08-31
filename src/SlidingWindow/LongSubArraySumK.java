package SlidingWindow;

public class LongSubArraySumK {

    // longest sub array with sum as k

    static int longSubArray(int[] arr, int k){

        int res = 0;
        int n = arr.length;

        for(int i=0; i < n; i++){

            int sum = 0;

            for(int j=i; j < n; j++){

                sum += arr[j];
                if(sum == k){
                    res = Math.max(res, j-i + 1);
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longSubArray(arr, k));

    }

}
