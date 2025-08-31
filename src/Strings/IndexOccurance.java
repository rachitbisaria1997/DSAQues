package Strings;

public class IndexOccurance {

    public static int strStr(String haystack, String needle){

        int n = haystack.length();
        int m = needle.length();

        if(m == 0){
            return 0;
        }

        for(int i=0; i <= n; i++){
            int j = 0;
            
            while(j < m && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
            }

            if(j == m){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "butsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));

    }

}
