package SortingAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEvenOdd {

    static void sortIt(int[] arr){

        List<Integer> odds = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i=0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }
            else {
                odds.add(arr[i]);
            }
        }

        Collections.sort(odds, Collections.reverseOrder());
        Collections.sort(even, Collections.reverseOrder());

        int idx = 0;

        for(int i=0; i < odds.size(); i++){
            arr[idx++] = odds.get(i);
        }

        for(int i=0; i < even.size(); i++){
            arr[idx++] = even.get(i);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 7, 10};

        sortIt(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
