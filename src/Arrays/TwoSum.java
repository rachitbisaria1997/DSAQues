package Arrays;

import java.util.HashSet;

public class TwoSum {


    static boolean twoSum(int[] arr, int target){

        int n = arr.length;

        for(int i=0; i < n -1 ; i++){

            for(int j=i+1; j <n; j++){

                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean twoSumm(int[] arr, int target){

        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for (int j : arr) {

            int complement = target - j;

            if (set.contains(complement)) {
                return true;
            }
            set.add(j);
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;



    }

}
