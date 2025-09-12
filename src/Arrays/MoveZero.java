package Arrays;

public class MoveZero {

    static void pushZerosToEnd(int [] arr){

        int j = 0;

        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }

        while(j < arr.length){
            arr[j++] = 0;
        }

        for(int h : arr){
            System.out.print(h + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

    }
}
