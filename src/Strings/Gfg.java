package Strings;

import java.util.ArrayList;
import java.util.List;

public class Gfg {

    static int[] sumClosest(int [] arr, int target){

        int n = arr.length;
        List<Integer> al = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int[] res = new int[2];

        for(int i=0; i < n - 1; i++){

            for(int j= i + 1; j < n; j++){
                int sum = arr[i] + arr[j];
                int diff = Math.abs(sum - target);

                if(diff < minDiff){
                    minDiff = diff;
                    res[0] = arr[i];
                    res[1] = arr[j];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;

        int[] res = sumClosest(arr, target);
        if(res.length > 0){
            System.out.println(res[0] + "  "+ res[1]);
        }
    }

}
