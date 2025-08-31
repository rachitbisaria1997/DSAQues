package Searching;

public class FindMissNUm {

    static int findFirstRepeatingElement(int [] arr, int n){

        for(int i = 0; i < n; i++){

            for(int j = i +1; j < n; j++){
                if(arr[i] == arr[j]){
                    return i;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args){

        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;

        int index = findFirstRepeatingElement(arr, n);

        if(index == -1){
            System.out.println("no repeating element found");
        }
        else{
            System.out.println("first repeating element is "+ arr[index]);
        }

    }

}
