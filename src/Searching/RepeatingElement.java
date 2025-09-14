package Searching;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RepeatingElement {

    static int firstRepeatingElement(int [] arr, int n){

        for(int i=0; i < n; i++){

            for(int j=i+1; j < n; j++){

                if(arr[i] ==  arr[j]){
                    return arr[i];
                }

            }
        }
        return -1;
    }

    static int firstRep(int [] arr, int n){

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int ans = -1;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1){
                ans = key;
            }
        }

        return ans;
    }

    public static void main(String [] args){

        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;

        // Finding the index of first repeating element
        int index = firstRep(arr, n);

        System.out.println(index);

        // Checking if any repeating element is found or not
//        if (index == -1) {
//            System.out.println("No repeating element found!");
//        }
//        else {
//            System.out.println("First repeating element is " + arr[index]);
//        }

    }
}
