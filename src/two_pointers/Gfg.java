package two_pointers;

public class Gfg {

    static int removeElement(int[] arr, int el){

        int k=0;
        int n = arr.length;
        for(int i=0; i < n; i++){
            if(arr[i] != el){
                arr[k] = el;
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int ele = 2;
        System.out.println(removeElement(arr, ele));
    }

}
