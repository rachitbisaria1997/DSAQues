package Stacks;

import java.util.Scanner;
import java.util.Stack;

class mNge {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 25, 7, 8};

        int n = 6;

        Stack<Integer> stack = new Stack<>();
        int [] nge = new int[n];

        for(int i= n-1; i>=0; i--){

            while(!stack.isEmpty() && stack.peek() < arr[i]){
                stack.pop();
            }

            nge[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        for(int i=0; i < n; i++){
            System.out.println(nge[i] + "  ");
        }
    }
}
