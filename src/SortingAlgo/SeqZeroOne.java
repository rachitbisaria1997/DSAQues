package SortingAlgo;

public class SeqZeroOne {

    static void segregate0and1(int arr[], int n){
        int count = 0;

        for(int i=0; i < n; i++){
            if(arr[i] == 0){
                count += 1;
            }
        }

        for(int i=0; i < count; i++){
            arr[i] = 0;
        }

        for(int j = count; j < n; j++){
            arr[j] = 1;
        }
    }

    static void print(int [] arr, int n){

        for(int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args){
        int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 };
        int n = arr.length;

        segregate0and1(arr, n);
        print(arr, n);
    }

}
