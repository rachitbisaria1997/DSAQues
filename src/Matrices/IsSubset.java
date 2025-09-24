package Matrices;

import java.util.Arrays;

public class IsSubset {

    public static boolean isSubset(int[] a, int[] b){

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0, len = 0;

        while(i < a.length && j < b.length){

            if(a[i] == b[j]){
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else  {
                return false;
            }

        }
        return i == b.length;
    }

    public static void main(String[] args) {

        int[] a = {11, 1, 13, 21, 3, 7}; //  1 3 7 11 13 21
        int[] b = {11, 3, 7, 1};          // 1 3 7 11

        if (isSubset(a, b)) System.out.println("true");
        else System.out.println("false");

    }
}
