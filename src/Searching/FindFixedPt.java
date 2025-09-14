package Searching;

public class FindFixedPt {

    static int fixedPoint(int[] arr){

        for(int i=0; i < arr.length; i++){
            if(arr[i] == i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -10, -5, 0, 3, 7 };
        System.out.println(fixedPoint(arr));
    }

}
