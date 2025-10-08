package SortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int arr[], int left, int mid, int right){

        ArrayList<Integer> al = new ArrayList<>();
        int i = left;
        int j = mid + 1;

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                al.add(arr[i++]);
            }
            else{
                al.add(arr[j++]);
            }
        }

        while (i <= mid) {
            al.add(arr[i++]);
        }

        while (j <= right) {
            al.add(arr[j++]);
        }

        for (int k = 0; k < al.size(); k++) {
            arr[left + k] = al.get(k);
        }

    }

    static void sort(int arr[], int left, int right){
        if(left < right){
            int mid = (left + right) / 2;

            // sort left half
            sort(arr, left, mid);

            // sort right half
            sort(arr, mid + 1, right);

            mergeSort(arr, left, mid, right);

        }
    }

    public static void main(String[] args) {

        int arr[] = {38, 27, 43, 10};

        System.out.println("original array "+ Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("sorted array is "+ Arrays.toString(arr));

    }
}
