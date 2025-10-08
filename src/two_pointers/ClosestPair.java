package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPair {

    public static void findClodPair(int [] arr1,int [] arr2,  int target){

        int diff = Integer.MAX_VALUE;
        int res_l = 0, res_r = 0;

        int l =0, r = arr2.length - 1;

        while(l < arr1.length && r >= 0)
        {
            if(Math.abs(arr1[l] + arr2[r] - target) < diff){
                res_l = l;
                res_r = r;
                diff = Math.abs(arr1[l] + arr2[r] - target);
            }
            else if(arr1[l] + arr2[r] > target){
                r--;
            }
            else {
                l++;
            }
        }

        System.out.println("closest pair is ["+ arr1[res_l] + ", " + arr2[res_r] + "]");

    }

    public static void main(String[] args){

        ClosestPair obj = new ClosestPair();

        int[] ar1 = {1, 4, 5, 7};
        int[] ar2 = {10, 20, 30, 40};
        int x = 38;

        findClodPair(ar1, ar2, x);

    }
}
