package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RepeatingChar {
    // Longest Substring Without Repeating Characters

    static int longestUniqueSubstr(String str){
        int n = str.length();
        int res = Integer.MIN_VALUE;

        for(int i=0; i < n; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i; j < n; j++){
                String sub = str.substring(i, j);

                for(char ch : sub.toCharArray()){

                    if(!set.contains(ch)){
                        set.add(ch);
                    }
                }

                res = Math.max(res, set.size());
            }
        }

        return res;
    }
    
    public static void main(String[] args){
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s));
    }

}
