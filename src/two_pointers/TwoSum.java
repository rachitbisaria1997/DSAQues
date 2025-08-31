package two_pointers;

import java.util.Arrays;

public class TwoSum {

    static boolean twoSum(int[] arr, int target){

        int n = arr.length;
        boolean exists = false;

        for(int i=0; i < n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    exists = true;
                }
            }
        }
        return exists;
    }

    static boolean binarySearch(int [] arr, int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }

//    static boolean binarySearch(int[] arr, int left, int right, int target){
//        while(left <= right){
//            int mid = left + (right-left)/2;
//
//            if(arr[mid] ==  target){
//                return true;
//            }
//            else if(arr[mid] < target){
//                left = mid + 1;
//            }
//            else{
//                right = mid -1;
//            }
//        }
//        return false;
//    }

        static boolean binarySearchh(int[] arr, int target){
        Arrays.sort(arr);

        boolean search = false;
        for(int i=0; i < arr.length; i++){
            int complement = target - arr[i];
            if(binarySearch(arr, i+1, arr.length-1, complement)){
                search = true;
            }
        }
        return search;
    }

    public static void main(String[] args) {

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        if(twoSum(arr, target)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        binarySearchh(arr, target);

    }

}