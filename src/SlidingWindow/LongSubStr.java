package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongSubStr {

    // longest substring with k unique characters

    public static int longKSubStr(String s, int k){

        int ans = -1;
        int n = s.length();
        Set<Character> set = new HashSet<>();

        for(int i=0; i < n; i++){

            set.clear();

            for(int j = i; j < n; j++){

                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                }

                if(set.size() == k){
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longKSubStr(s, k));

    }

}
