package Strings;

import java.util.HashMap;
import java.util.Map;

public class SameOccurences {
    
    public static void main(String[] args){

        String s = "aabbb";
        boolean ans = areOccurences(s);

        System.out.println(ans);

    }

    public static boolean areOccurences(String s){

        boolean isGood = true;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        int firstCount = map.get(s.charAt(0));

        for(char ch : map.keySet()){
            if(map.get(ch) != firstCount){
                isGood = false;
                break;
            }
        }

        return isGood;

    }

}
