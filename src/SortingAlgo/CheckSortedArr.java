package SortingAlgo;

public class CheckSortedArr {

    public static boolean isSorted(int [] arr, int n){

        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){

                if(arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 45 };
        int n = arr.length;

        if (isSorted(arr, n)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }

    }
}
