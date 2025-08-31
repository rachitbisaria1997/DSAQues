package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ReturnIndices {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int [] result = twoSum(nums, target);
        System.out.print(result[0] + " , " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target){
        int first = -1;
        int second = -1;

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    first = i;
                    second = j;
                }
            }
        }

        return new int[]{first, second};
    }

}
