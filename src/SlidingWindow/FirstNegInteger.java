package SlidingWindow;

import java.util.*;

public class FirstNegInteger {


    public static List<Integer> firstNegInteger(int[] arr, int k){

        //First negative integer in every window of size k

        List<Integer> res = new ArrayList<>();
        int n = arr.length;

        for(int i=0; i < n; i++){
            
            int length = 0;
            
            for(int j = i; j < n; j++){

                length++;

                if(length == k){
                    for(int m = i; m < j; m++){
                        if(arr[m] < 0){
                            res.add(arr[m]);
                            break;
                        }
                    }
                }
            }
        }

        return res;

    }


    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        List<Integer> res = firstNegInteger(arr, k);
        for(int r : res){
            System.out.print(r + " ");
        }

    }

}
