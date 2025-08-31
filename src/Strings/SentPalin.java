package Strings;

public class SentPalin {

    static boolean  isPalinSent(String s){
        StringBuilder s1 = new StringBuilder();
        StringBuilder rev = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                s1.append(ch);
            }
        }

        for(int j=s1.length(); j>=0; j--){
            rev.append(s1.charAt(j));
        }

        return s1.toString().equals(rev.toString());
    }

    public static void main(String[] args) {

        String s = "Too hot to hoot.";
        System.out.println(isPalinSent(s));
    }
}
