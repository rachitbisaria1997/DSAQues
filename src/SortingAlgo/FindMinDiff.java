package SortingAlgo;

public class FindMinDiff {

    public static int minSumDiff(int [] arr){
        int sum = 0;

        for(int i=0; i < arr.length; i++){
            int minDiff = Integer.MAX_VALUE;

            for(int j = 0; j < arr.length; j++){
                if(i != j){
                    minDiff = Math.min(minDiff, Math.abs(arr[i] - arr[j]));
                }
            }
            sum += minDiff;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5};
        System.out.println(minSumDiff(arr));
    }
}
