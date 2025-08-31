package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ProdArray {

    public static int[] productExceptSelf(int[] nums){

        int n = nums.length;
        List<Integer> al = new ArrayList<>();
        int l = 0;

        for(int i=0; i < n; i++){

            int mul = 1;

            for(int j=0; j < n; j++){

                if(j != i){
                    mul *= nums[j];
                }
            }
            al.add(mul);
        }

        for(int k : al){
            nums[l++] = k;
        }

        return nums;
    }

    public static void main(String[] args) {
        int [] nums =  {1, 2, 3, 4};
        int [] result = productExceptSelf(nums);
        for(int val : result){
            System.out.print(val + " ");
        }
    }

}
