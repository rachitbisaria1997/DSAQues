package SlidingWindow;

import java.util.*;

public class CountDistinct {

    static List<Integer> countDistinct(int[] arr, int k) {

        List<Integer> al = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i < arr.length; i++){

            int length = 0;
            set.clear();

            for(int j = i; j < arr.length; j++){

                length++;
                if(length == k){

                    int[] subArr = Arrays.copyOfRange(arr, i, j + 1);

                    for(int x : subArr){
                        set.add(x);
                    }
                    al.add(set.size());
                }
            }
        }
        return al;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinct(arr, k)); // [3, 4, 4, 3]
    }


}
