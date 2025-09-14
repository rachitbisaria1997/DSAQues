package Searching;

import java.util.Arrays;

public class KSmallest {

    public static int kthSmallest(int [] arr, int k){

        Arrays.sort(arr);

        return arr[k - 1];

    }

    public static void main(String[] args) {

        int ar2[] = {12, 3, 5, 7, 19 }; // 3 5 7 12 19
        int k = 2;

        System.out.println(kthSmallest(ar2, k));
        System.out.println(kthSmallest(ar2, 3));

    }
}
