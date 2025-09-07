package Arrays;

public class MoveZero {

    static void pushZerosToEnd(int [] arr){

        int count = 0;
        int j = 0;
        int newArr[] = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0){
                newArr[j++] = arr[i];
            }
            else{
                count += 1;
            }
        }

        while(j < arr.length){
            newArr[j++] = 0;
        }

        for(int h : newArr){
            System.out.print(h + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

    }
}
