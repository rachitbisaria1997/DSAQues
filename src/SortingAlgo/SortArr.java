package SortingAlgo;

public class SortArr {

    static void sortArr(int [] arr){

        int n = arr.length;
        int i = 0;
        int rCount = 0;
        int k = 0;

        int [] newArr = new int[n];

        for(int j=0; j < n; j++){

            if(arr[j] == 0){
                newArr[i++] = 0;
            }

            else{
                rCount += 1;
            }
        }

        while(k < rCount){
            newArr[i++] = 1;
            k++;
        }

        for(int g = 0; g < n; g++){
            arr[g] = newArr[g];
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
