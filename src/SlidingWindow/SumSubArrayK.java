package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SumSubArrayK {

    public static void sumSubArray(int[] arr, int n, int k){

        List<Integer> al = new ArrayList<>();

        for(int i=0; i < n; i++){
            int length = 0;
            int sum = 0;

            for(int j=i; j < n; j++){
                length+=1;

                if(length == k){

                    for(int m = i; m <= j; m++){
                        sum += arr[m];
                    }
                    al.add(sum);
                }
            }
        }

        for(int e : al){
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        sumSubArray(arr, arr.length, 3);

    }
}
