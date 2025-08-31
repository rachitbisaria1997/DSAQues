package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args){

        String st = "GeeksforGeeks";
        String rever = "";

        for(int i = st.length() - 1; i>=0; i--){

            rever += st.charAt(i);
        }

        System.out.println(rever);

        System.out.println(reverseWords("i.like.this.program.very.much"));
    }

    static String reverseWords(String str){

        String[] parts = str.split("\\.");
        List<String> words = new ArrayList<>();

        for(String word : parts){
            if(! word.isEmpty()){
                words.add(word);
            }
        }

        Collections.reverse(words);

        System.out.println(words);

        return String.join(".", words);
    }

}
