package Strings;

import java.util.LinkedHashMap;

public class NonRepeating {

    public static void main(String[] args) {

        String word = "ccurrence";

        char res = nonRep(word);

        System.out.println(res);

        System.out.println(nonRepIndex(word));
     }

     public static char nonRep(String s){

         LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

         for(char ch : s.toCharArray()){
             map.put(ch, map.getOrDefault(ch, 0) + 1);
         }

         for(char ch : map.keySet()){
             if(map.get(ch) == 1){
                 return ch;
             }
         }
         return '\0';
     }

     public static int nonRepIndex(String s){

        int[] freq = new int[26];

       for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

         for (int i = 0; i < s.length(); i++) {
             if (freq[s.charAt(i) - 'a'] == 1) {
                 return i;
             }
         }
        //ccurrence
        return -1;
     }

}
