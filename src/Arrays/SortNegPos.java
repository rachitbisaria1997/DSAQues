package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SortNegPos {

    public static void sortNegPos(int[] arr){
        int j = 0;
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();


        for(int i : arr){
            if(i >= 0){
                pos.add(i);
            }
            else{
                neg.add(i);
            }
        }

        for(int i : pos){
            arr[j++] = i;
        }

        for(int x : neg){
            arr[j++] = x;
        }

    }


    public static void alternateNegPos(int [] arr){
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for(int i : arr){
            if(i < 0){
                neg.add(i);
            }
            else{
                pos.add(i);
            }
        }

        int i=0, p = 0, j=0;

        while(i < neg.size() && p < pos.size()){
            arr[j++] = neg.get(i++);
            arr[j++] = pos.get(p++);
        }

        while(i < neg.size()){
            arr[j++] = neg.get(i++);
        }

        while(p < pos.size()){
            arr[j++] = pos.get(p++);
        }
    }

    public static void main(String[] args) {

        int arr[] = {-1, 5,-2, 3,4,-8};
        sortNegPos(arr);

        for(int num : arr){
            System.out.print(num + "  ");
        }

        System.out.println();

        alternateNegPos(arr);

        for(int num : arr){
            System.out.print(num + "  ");
        }
    }

}
