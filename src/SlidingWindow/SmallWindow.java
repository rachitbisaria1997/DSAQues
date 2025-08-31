package SlidingWindow;

import java.util.*;

public class SmallWindow {

    public static int findSubString(String str){
        
        int n = str.length();
        Set<Character> set = new HashSet<>();

        for(char ch :  str.toCharArray()){
            set.add(ch);
        }

        List<Character> list = new ArrayList<>(set);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            sb.append(ch);
        }
        String result = sb.toString();

        int res = Integer.MAX_VALUE;

        for(int i=0; i < n; i++){

            for(int j=i; j < n; j++){

                String subStr = str.substring(i, j);
                char[] chars = subStr.toCharArray();
                Arrays.sort(chars);
                String sortedStr = new String(chars);

                if(sortedStr.equals(result)){
                    res = Math.min(res, j-i + 1);
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String str = "aabcbcdbca";
        System.out.print(findSubString(str));
    }
}
