package Hashing;

public class First {

    public static void main(String[] args) {

        int [] arr = {1 ,2, 1 ,2 ,1 ,3 ,4 ,1 ,2 ,3};
        findFrequence(arr);

    }

    public static void findFrequence(int arr[]){

        int n = arr.length;
        int max_elem = 0;

        for(int i=0; i < n; i++){

            if(arr[i] > max_elem){
                max_elem = arr[i];
            }
        }

        int[] hash = new int[max_elem + 1];

        for(int i=0; i <= max_elem; i++){
            hash[i] = 0;
        }

        for(int i=0; i < n; i++){
            hash[arr[i]]++;
        }

        for(int i=0; i < n; i++){
            System.out.print(hash[arr[i]] + " ");
        }
        System.out.println();
    }

}
