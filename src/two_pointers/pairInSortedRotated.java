package two_pointers;

import java.util.Arrays;
import java.util.HashSet;

public class pairInSortedRotated {

    static boolean pairInSortedRotated(int [] arr, int target){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i < arr.length; i++){

            int complement = target - arr[i];
            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }


    static boolean pairSortedExists(int [] arr, int target){

        int n = arr.length;
        int left = 0, right = n - 1;
        Arrays.sort(arr);

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == target){
                return true;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        if(pairSortedExists(arr, target)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}
