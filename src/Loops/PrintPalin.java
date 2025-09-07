package Loops;

public class PrintPalin {

    public static void main(String[] args) {

        for(int num = 100000; num <= 999999; num++){

            if(isPalindrome(num)){
                System.out.println(num);
            }

        }

    }

    public static boolean isPalindrome(int num){

        String num_word = String.valueOf(num);

        String revers = new StringBuilder(num_word).reverse().toString();

        if(num_word.equals(revers)){
            return true;
        }
        else{
            return false;
        }

    }

}
