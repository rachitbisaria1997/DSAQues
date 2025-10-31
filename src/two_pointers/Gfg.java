package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    
    
    static void removeElem(int[] arr, int ele){
        int count = 0;

        for(int num : arr){
            if(num != ele){
                count++;
            }
        }

        int[] newArr = new int[count];
        int j = 0;
        for(int x : arr){
            if(x != ele){
                newArr[j++] = x;
            }
        }

        System.out.println(Arrays.toString(newArr));
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
