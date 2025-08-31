package Arrays;

import java.util.HashSet;

public class PairSum {

    static boolean isPairExists(int [] arr, int target){
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

        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        if(isPairExists(arr, target)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }

}
