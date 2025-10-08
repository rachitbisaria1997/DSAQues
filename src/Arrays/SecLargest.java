package Arrays;

public class SecLargest {

    static void getSecondLargest(int [] arr){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0; i < arr.length; i++){

            int num = arr[i];
            if(num > first){
                third = second;
                second = first;
                first = num;
            }
            else if(num > second){
                third = second;
                second = num;
            }
            else if(num > third && num < second){
                third = num;
            }

        }
        System.out.println("third largest element is "+ third + " second largest is "+ second);
    }

    public static void main(String[] args) {
        int [] arr =  {12, 35, 1, 10, 34, 13};
        getSecondLargest(arr);
    }

}
