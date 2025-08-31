package two_pointers;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SubSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){

            String m = "john";
            String w = "johanna";

            if(isSub(m,w) || isSub(w, m)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }

    static boolean isSub(String m, String w){

        int l1 = m.length();
        int l2 = w.length();

        int i=0, j=0;

        while(i < l1 && j < l2){

            if(m.charAt(i) == w.charAt(j)){
                i++;
            }
            j++;
        }

        return i == l1;

    }

}
