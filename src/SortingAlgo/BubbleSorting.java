package SortingAlgo;

public class BubbleSorting {

    static void bubbleSort(int arr[], int n){

        // tc - On(n2)

        int size = arr.length;
        int temp;

        for(int i=0; i < size; i++){

            for(int j=0; j < size-1; j++){

                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }

    static void printArray(int arr[], int size){
        for(int i=0; i < size; i++){
            System.out.println(arr[i]);
        }

    }

   public static void main(String[] args){}
    {

        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);

    }
}
