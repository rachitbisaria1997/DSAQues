package Arrays;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words){

        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String word : words){

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagramMap.values());

        //It checks if anagramMap already contains the key sortedWord.
        //
        //If yes → returns the existing list.
        //
        //If no → creates a new ArrayList<> using the lambda k -> new ArrayList<>() and puts it in the map under that key.

    }

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> groupedAnagrams = groupAnagrams(words);

        for(List<String> group : groupedAnagrams){
            System.out.println(group);
        }

    }

}
