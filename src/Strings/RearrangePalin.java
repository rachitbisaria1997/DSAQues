package Strings;

import java.util.HashMap;
import java.util.Map;

public class RearrangePalin {

    public static void main(String[] args) {
        String input = "ivicc";

        System.out.println(canFormPalin(input));

        String inputt = "ivnicc";

        System.out.println(canFormPalin(inputt));
    }

    public static boolean canFormPalin(String str){

        // ivicc
        // iivvvcc
        // for a palindromic rearrangement, odd count freq character can only be 1 or 0else others should be of even count

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }

        int oddCount = 0;
        for(int count : map.values()){
            if(count % 2 != 0){
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

}
