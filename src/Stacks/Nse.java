package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Nse {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int [] nge = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i= n-1; i >=0; i--){

            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
        }

        for(int i=0; i < n; i++){
            System.out.println(nge[i]);
        }

    }
}
