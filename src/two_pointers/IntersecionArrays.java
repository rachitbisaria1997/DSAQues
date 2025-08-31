package two_pointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IntersecionArrays {

    static ArrayList<Integer> intersecion(int[] a, int[] b){

        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i < a.length; i++){

            for(int j=0; j < b.length; j++){
                if(a[i] == b[j]){
                    res.add(a[i]);
                }
            }
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {

        int[] a = {5, 6, 2, 1, 4};
        int[] b = {7, 9, 4, 2};

        ArrayList<Integer> res = intersecion(a, b);
        for(int i : res){
            System.out.print(i + " ");
        }
    }

}
