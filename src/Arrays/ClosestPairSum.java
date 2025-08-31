package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ClosestPairSum {

    static List<Integer> sumClosest(int [] arr, int target){

        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        int[] res = new int[2];
        List<Integer> al = new ArrayList<>();

        for(int i = 0; i < n-1; i++){

            for(int j = i+1; j < n; j++){

                int currSum = arr[i] + arr[j];
                int diff = Math.abs(currSum - target);
                if(diff < minDiff){
                    minDiff = diff;

                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        al.add(res[0]);
        al.add(res[1]);

        return al;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;

        List<Integer> res = sumClosest(arr, target);
        System.out.println(res.get(0) + "  "+ res.get(1));

    }

}
