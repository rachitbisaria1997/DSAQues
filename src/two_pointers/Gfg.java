package two_pointers;

public class Gfg {

    static int removeElement(int[] arr, int el){

        int slow = 0;

        for(int fast = 0; fast < arr.length; fast++){
            if(arr[fast] != el){
                arr[slow] = arr[fast];
                slow++;
            }
        }
        return slow;

    }

    public static void main(String[] args){
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int targrt = 2;

        int newLen = removeElement(arr, targrt);

        System.out.println("array after removal is ");
        for(int i=0; i < newLen; i++){
            System.out.print(arr[i] + "  ");
        }
    }

}
