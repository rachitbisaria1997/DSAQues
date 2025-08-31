package Arrays;

public class MaxCons {

    static int maxConsBits(int [] arr){

        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 1){
                count += 1;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 1, 1, 1, 1 };
        System.out.println(maxConsBits(arr));
    }
}
