package Strings;

import java.util.Arrays;

public class PalinDromeStr {

    public static void main(String[] args) {
        String str = "abba";

        boolean res = isPalindrome(str);

        System.out.println(res);
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        boolean isPalin = true;

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                isPalin = false;
            }

            left ++;
            right --;
        }

        return isPalin;
    }

    static boolean areAnagrams(String s1, String s2){

        boolean result = true;

        if(s1.length() != s2.length()){
            result = false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        String first = new String(s1Array);
        String second = new String(s2Array);

        if(!first.equals(second)){
            result = false;
        }
        return result;
    }
}
