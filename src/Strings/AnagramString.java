package Strings;

import java.util.Arrays;

public class AnagramString {

    public static boolean isAnagram(String a, String b){
        String first = a.toLowerCase();
        String second = b.toLowerCase();

        char [] ch = first.toCharArray();
        char[] bv = second.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(bv);

        String one = new String(first);
        String sec = new String(second);

        if(one.equals(sec)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        String one = "geeks";
        String sec = "kseeg";

        isAnagram(one, sec);

    }
}
