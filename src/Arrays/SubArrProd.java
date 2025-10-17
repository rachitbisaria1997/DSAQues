package Arrays;

public class SubArrProd {
    // count no of subarrays whose product is equal to k
    static int countSubArray(int arr[], int n, int k){

        int count = 0;
        int i, mul;

        for(i =0; i < n; i++){

            if(arr[i] < k){
                count++;
            }

            mul = arr[i];

            for(int j = i+1; j < n; j++){

                mul = mul * arr[j];
                if(mul < k){
                    count++;
                }
                else{
                    break;
                }

            }
        }

        return count;

    }
    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 4 };
        int k = 10;
        int size = array.length;

        int count = countSubArray(array, size, k);

        System.out.println(count);

    }
}
