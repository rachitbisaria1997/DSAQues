package Arrays;

public class SumSubArray {

    public static void main(String[] args){

        int[] arr = {2, 4, 1, 3};
        int totalSum = 0;

        for(int num : arr){
            totalSum += num;
        }

        int currSum = 0;

        for(int i = 0; i < arr.length; i++){

            currSum = 0;

            for(int j=i; j < arr.length; j++){

                currSum += arr[j];
                if(currSum == totalSum){

                    for(int k=i; k <= j; k++){
                        System.out.print(arr[k] + " ");
                    }
                    return;
                }
            }

        }


    }
}
