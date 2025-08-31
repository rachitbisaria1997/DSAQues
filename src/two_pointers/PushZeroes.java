package two_pointers;

public class PushZeroes {

    static void pushZerostoEnd(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j=0;

        for(int i=0; i < n; i++){
            if(arr[i] != 0){
                temp[j++] = arr[i];
            }
        }

        while(j < n){
            temp[j++] = 0;
        }

        for(int k=0; k < n; k++){
            arr[k] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerostoEnd(arr);
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
