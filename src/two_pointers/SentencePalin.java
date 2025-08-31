package two_pointers;

public class SentencePalin {

    static boolean isPalin(String s){

        int i = 0, j = s.length() - 1;

        while (i < j){

            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
            else {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        String s = "Too hot to hoot.";
        System.out.println(isPalin(s) ? "true" : "false");

    }

}
