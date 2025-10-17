package Stacks;

import java.util.Stack;

public class RemoveAdjChar {

    public static String removeUsingStack(String s){

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        for(char ch : stack){
            sb.append(ch);
        }

        return sb.toString();
    }


    public static void main(String[] args){

        System.out.println(removeUsingStack("ABBC"));     // AC
        System.out.println(removeUsingStack("ABCCBDA"));  // ADA

    }

}
