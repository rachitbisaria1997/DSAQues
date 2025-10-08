package SortingAlgo;

public class SortArr {

    static void sortArr(int [] arr){

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i]; // <-- FIX: use arr[i], not 1
            }
        }

        while (j < arr.length) {
            arr[j++] = 0;
        }

    }

    public static void main(String[] args) {

        int [] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        sortArr(arr);
        int n = arr.length;

        for(int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
