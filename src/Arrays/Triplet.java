package Arrays;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;

public class Triplet {

    public static void main(String[] args) {

        int[] arr = {0, -1, 2, -3, 1};
        ArrayList<ArrayList<Integer>> res = findTriplets(arr);
        for (List<Integer> triplet : res)
            System.out.println(triplet.get(0) + " " + triplet.get(1)
                    + " " + triplet.get(2));

    }

    static ArrayList<ArrayList<Integer>> findTriplets(int[] arr){

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){

                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(i);
                        al.add(j);
                        al.add(k);
                        res.add(al);
                    }
                }
            }
        }

        return res;
    }

}
