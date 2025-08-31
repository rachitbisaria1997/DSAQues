package two_pointers;

public class FindDomPairs {

    static void dominPairs(int [] arr){

        int n = arr.length - 1;
        int count = 0;

        for(int i=0; i < n/2; i++){

            for(int j = n/2; j < n; j++){

                if(arr[i] >= 5 * arr[j]){
                    count += 1;
                }
            }

        }

        System.out.println("valid count is "+ count);

    }

    public static void main(String[] args) {

        int[] arr = {10, 2, 2, 1};
        dominPairs(arr);

    }

}
