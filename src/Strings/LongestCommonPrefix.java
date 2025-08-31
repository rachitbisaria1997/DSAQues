package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println(findLCP(arr));

    }

    public static String findLCP(String[] arr){

        if(arr == null || arr.length == 0){
            return "";
        }

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];
        String res = "";
        int i = 0;

        while(i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }

        String lcp = first.substring(0, i+1);
        return lcp;
    }

}
