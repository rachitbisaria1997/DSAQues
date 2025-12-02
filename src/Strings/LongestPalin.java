package Strings;

public class LongestPalin {

    public static void main(String[] args) {

        String output = "abacdfgdcaba";
        int maxPalinLen = Integer.MIN_VALUE;
        String maxPalinStr = "";

        for(int i=0; i < output.length(); i++){
            for(int j=i; j < output.length(); j++){

                String subStr = output.substring(i, j+1);
                if(isPalindrome(subStr)){
                    if(subStr.length() > maxPalinLen){
                        maxPalinLen = subStr.length();
                        maxPalinStr = subStr;
                    }
                }
            }
        }
        System.out.println(maxPalinStr);
    }

    public static boolean isPalindrome(String str){

        int left = 0, right = str.length() - 1;

        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
