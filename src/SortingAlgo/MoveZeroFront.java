package SortingAlgo;

public class MoveZeroFront {

    static void pushZerosToFront(int [] arr){
        int n = arr.length;
        int j = n - 1;

        for(int i = n-1; i >=0; i--){

            if(arr[i] != 0){
                arr[j] = arr[i];
                j--;
            }
        }

        while(j >= 0){
            arr[j] = 0;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToFront(arr);

        for(int i : arr){
            System.out.print(i + "  ");
        }
    }

}
