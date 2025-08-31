package SortingAlgo;

public class CheckSortedArray {

    static boolean isSortedArr(int arr[], int n){

        boolean isSorted = true;

        for(int i=0; i < n -1; i++){

            for(int j = i + 1; j < n; j++) {

                if(arr[i] > arr[j]){

                    isSorted = false;
                }
            }
        }

        return isSorted;
    }


    static boolean isSort(int arr[]){

        int n = arr.length;

        for(int i=1; i < n; i++){

            if(arr[i-1] > arr[i]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 12 };
        int n = arr.length;

        if(isSort(arr)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
