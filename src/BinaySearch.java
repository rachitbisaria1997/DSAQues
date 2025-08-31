import java.util.HashMap;
import java.util.Scanner;

public class BinaySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(avgFlex(arr));
    }

    public static int avgFlex(int[] arr){

        int count = 0;
        for(int i=0; i < arr.length; i++){
            int lEql = 0;
            int gEql = 0;

            for(int j=0; j< arr.length;j++){
                if(j != i){
                    if(arr[j] <= arr[i]){
                        lEql++;
                    }
                    else{
                        gEql++;
                    }
                }
            }
            if(lEql > gEql){
                count+=1;
            }

        }

        return count;
    }
}
