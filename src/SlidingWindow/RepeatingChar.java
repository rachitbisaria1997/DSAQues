package SlidingWindow;

import java.util.HashSet;

public class RepeatingChar {
    // Longest Substring Without Repeating Characters

    static int longestUniqueSubstr(String str){

        int maxLength = Integer.MIN_VALUE;
        String longest = "";
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i < str.length(); i++){

            set.clear();
            for(int j=i; j < str.length(); j++){

                char ch = str.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                set.add(ch);

                if(set.size() > maxLength){
                    maxLength = set.size();
                    longest = str.substring(i, j + 1);
                }
            }
        }
        System.out.println(longest);
        return maxLength;
    }


    
    public static void main(String[] args){
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s));
    }

}
