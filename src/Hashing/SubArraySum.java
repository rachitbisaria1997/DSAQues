package Hashing;

import java.util.HashMap;

public class SubArraySum {

    public static void main(String[] args) {

        int[] arr = {1,1,1};
        int target = 2;
        int ans = subArraySum(arr, target);
        System.out.println(ans);
        System.out.println(findSubArray(arr, target));
    }

    public static int subArraySum(int [] nums, int k){

        int n = nums.length;
        int ans = 0;

        for(int i=0; i < n; i++){

            int sum = 0;

            for(int j=i; j < n; j++){

                sum += nums[j];
                if(sum == k){
                    ans += 1;
                }
            }
        }
        return ans;
    }

    public static int findSubArray(int [] nums, int k){

        int count = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num : nums){

            prefixSum += num;

            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

}
