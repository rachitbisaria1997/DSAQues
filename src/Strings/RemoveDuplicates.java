package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aaabceg";
        String result = removeDuplicates(str);
        System.out.println(result);
        dupChar(str);
    }

    public static String removeDuplicates(String str){

        HashSet<Character> map = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(!map.contains(ch)){
                map.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void dupChar(String str){

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }

        for(char ch : map.keySet()){
            if(map.get(ch) > 1){
                System.out.println(ch);
            }
        }

    }

}
