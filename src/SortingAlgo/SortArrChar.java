package SortingAlgo;

import java.util.Arrays;

public class SortArrChar {

    public static void main(String[] args) {

        String s = "geeksforgeeks";

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        s = new String(arr);
        System.out.println(s);
    }
}
