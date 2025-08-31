package Hashing;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args){

        String[] str = {"abc", "dba", "acb", "bda", "cba"};
        List<List<String>> op = groupAnagrams(str);

        for(List<String> list : op){

            for(String sp : list){
                System.out.print(sp + ' ');
            }

        }
        System.out.println();
    }
    
    public static List<List<String>> groupAnagrams(String[] strings){

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strings){

            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            String key = new String(charArr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
