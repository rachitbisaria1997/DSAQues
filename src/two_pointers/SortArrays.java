package two_pointers;

import java.util.Scanner;

public class SortArrays {

    static void sort(int [] arr){
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        int c0 = 0, c1 = 0, c2 = 0;
        int idx = 0;

        int [] temp = new int[n];
        for(int i=0; i < n; i++){
            if(arr[i] == 0){
                c0++;
            }
            else if(arr[i] == 1){
                c1++;
            }
            else if(arr[i] == 2){
                c2++;
            }
        }

        for(int j=0; j < c0; j++){
            arr[idx++] = 0;
        }

        for(int k=0; k < c1; k++){
            arr[idx++] = 1;
        }

        for(int g=0; g < c2; g++){
            arr[idx++] = 2;
        }

    }

    public static void main(String[] args) {
        int []arr = { 0, 1, 2, 0, 1, 2 };
        sort(arr);

        for(int d=0; d< arr.length; d++){
            System.out.print(arr[d] + " ");
        }
    }

}
