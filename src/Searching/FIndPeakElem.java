package Searching;

public class FIndPeakElem {

//    [1, 2, 4, 5, 7, 8, 3]
//    [0, 1, 2, 3, 4, 5, 6]
//    Output: 5
//    Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
//
    static int peakElement(int [] arr){
        int n = arr.length;
        int ans = -1;

        for(int i=1; i < n - 1; i++){

            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 80};

        int index = peakElement(arr);

        if(index == -1){
            System.out.println("peak element doesn't exists");
        }
        else {
            System.out.println("answer is "+ arr[index]);
        }

    }

}
