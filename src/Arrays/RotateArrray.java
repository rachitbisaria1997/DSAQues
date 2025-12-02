package Arrays;

import java.util.Arrays;

public class RotateArrray {

    public  static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5};

        int last = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--){

            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));

        int t = 3;
        rotateKTimes(arr, t);
    }

    public static void rotateKTimes(int[] arr, int t){

        for(int i=0; i < t; i++){

            int last = arr[arr.length - 1];

            for(int j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j-1];
            }

            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }


}
