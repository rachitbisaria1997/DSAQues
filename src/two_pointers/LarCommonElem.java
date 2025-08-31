package two_pointers;

import java.util.*;

public class LarCommonElem {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 6, 7};
        int[] arr2 = {2, 3, 5, 6, 7, 8};

        System.out.println(largCommElem(arr1, arr2));
    }

    public static int largestCommonElem(int [] arr1, int [] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = arr1.length -1, j = arr2.length -1;

        while(i >=0 && j >= 0){

            if(arr1[i] == arr2[j]){
                return arr1[i];
            }
            else if(arr1[i] > arr2[j]){
                i--;
            }
            else{
                j--;
            }

        }
        return -1;
    }

    public static int largCommElem(int [] arr1, int [] arr2){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<Integer> al = new ArrayList<>();

        for(int i : arr1){
            set1.add(i);
        }

        for(int j : arr2){
            set2.add(j);
        }

        for(int k : set1){

            if(set2.contains(k)) {
                al.add(k);
            }
        }

        Collections.reverse(al);

        return al.get(0);

    }

}
