package Arrays;

public class MaxSubArray {
    
    public static int maxSumArray(int [] nums){

        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i=1; i < nums.length; i++){
            currSum+= nums[i];
            currSum = Math.max(nums[i], currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("max subarray sum "+ maxSumArray(nums));
    }

}
