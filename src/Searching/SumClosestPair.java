package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumClosestPair {

    void printClosest(int ar1[], int ar2[], int m, int n, int x){

        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int minDiff = Integer.MAX_VALUE;
        List<Integer> res = new ArrayList<>();

        int i = ar1.length - 1;
        int j = ar2.length - 1;

        while(i >=0 && j >= 0){

            int sum = ar1[i] + ar2[j];
            int diff = Math.abs(sum - x);
            if(diff == 0){
                System.out.println("closest pair is "+ ar1[i] + "  "+ ar2[j]);
                break;
            }
            if(diff < minDiff){
                minDiff = diff;
                res = Arrays.asList(ar1[i], ar2[j]);
                i--;
                j--;
            }
            else if(ar1[i] > ar2[j]){
                i--;
            }
            else{
                j--;
            }
        }

        System.out.println("The closest pair is "+ res.get(0) + " "+ res.get(1));

    }

    public static void main(String[] args) {

        SumClosestPair obj = new SumClosestPair();
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int m = ar1.length;
        int n = ar2.length;
        int x = 50;

        obj.printClosest(ar1, ar2, m, n, x);

    }

}
