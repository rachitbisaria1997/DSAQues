package Strings;
import java.util.Arrays;

public class ConcatString {

    public static void main(String[] args) {

        String str = "Hi,Youu,Papapap";
        String ans = sortAndConcatenate(str);
        System.out.print(ans);
    }

    public static String sortAndConcatenate(String input) {
        String[] parts = input.split(",");
        Arrays.sort(parts);

        for(String s : parts){
            System.out.print(s + " ");
        }

        return String.join(" ", parts);

    }

}
