package Arrays;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int [] nums = {1,3,3,3,4,3};

        removeElement(nums, 3);

    }

    public static void removeElement(int [] nums, int val){
        int len = 0;
        for(int i : nums){
            if(i != val){
                len += 1;
            }
        }

        int[] result = new int[len];
        int index = 0;

        for(int num : nums){
            if(num != val){
                result[index++] = num;
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
