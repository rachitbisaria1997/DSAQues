package Arrays;

public class SecLargest {

    static int getSecondLargest(int [] arr){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0; i < arr.length; i++){

            if(arr[i] > first){
                first = arr[i];
            }
            else if(arr[i] > second && second != first){
                second = arr[i];
            }
            else if(arr[i] > third && third != second && third != first){
                third = arr[i];
            }

        }
        System.out.println("third largest element is "+ third);
        return second;
    }

    public static void main(String[] args) {
        int [] arr =  {12, 35, 1, 10, 34, 13};
        int ans = getSecondLargest(arr);
        System.out.println(ans);
    }

}
