package Searching;

public class MaxMinSearch {

    public static int findMax(int [] arr){

        int res = arr[0];

        for(int i=0; i < arr.length; i++){
            res = Math.max(res, arr[i]);
        }
        return res;
    }

    public static int findMin(int [] arr){

        int res = arr[0];

        for(int i=0; i < arr.length; i++){
            res = Math.min(res, arr[i]);
        }
        return res;
    }

    public static int findIndex(int [] arr, int target){

        for(int i=0; i < arr.length; i++){
            if(arr[i] ==  target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};

        System.out.println(findMax(arr));
        System.out.println(findMin(arr));

        int index = findIndex(arr, 3);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index "+ index);
        }

    }
}
