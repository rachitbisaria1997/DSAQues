package two_pointers;
import java.util.Arrays;
import java.util.Scanner;

public class MaxCommElem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int [] arr1 = new int[n];
            int [] arr2 = new int[n];
            int count = 0;

            for(int i = 0; i < n; i++){
                arr1[i] = sc.nextInt();
            }

            for(int j = 0; j < n; j++){
                arr2[j] = sc.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int i = arr1.length - 1, j = arr2.length - 1;

            while( i >=0 && j >=0 ){

                if(arr1[i] == arr2[j]){
                    count += 1;
                    i--;
                    j--;
                }
                else if(arr1[i] > arr2[j]){
                    i--;
                }
                else{
                    j--;
                }

            }

            System.out.println(count);
        }

    }

}
