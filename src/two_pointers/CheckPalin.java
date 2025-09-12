package two_pointers;

import java.util.Locale;

public class CheckPalin {

    static boolean checkPalindrome(String str){
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while(left < right){

            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String inp = "Racecar";

        if(checkPalindrome(inp)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }

}
