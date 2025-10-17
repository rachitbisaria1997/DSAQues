package Strings;

import java.util.Arrays;

public class SplitString {

    public static void main(String[] args) {

        String input = "apple,banana;grapes|mango";
        String[] parts = input.split("[,;|]");

        for(String part : parts){
            System.out.print(part + "  ");
        }

        System.out.println();

        String inp = "airtel:12345;jio:901;idea:1991";
        String[] pars = inp.split(";");
        for(String ent : pars){
            String[] pr = ent.split(":");
            for(String p : pr){
                System.out.print(p + " ");
            }
        }
        System.out.println();

        String s1 = "hello-from-GeeksforGeeks";
        String [] split = s1.split("-");
        for(String s : split){
            System.out.println(s + " ");
        }
    }
}
