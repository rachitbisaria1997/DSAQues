package Stacks;

import java.util.Stack;

public class ValidParenth {

    static boolean isBalanced(String s){

        Stack<Character> st = new Stack<>();

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                if((s.charAt(i) == ')'  && st.peek() != '(' )|| (s.charAt(i) == ']'  && st.peek() != '[' )
                || (s.charAt(i) == '}'  && st.peek() != '{' )
                ){
                    st.pop();
                }
            }
        }

        return st.isEmpty();

    }

    public static void main(String[] args){

        String s = "{([])}";
        System.out.println(isBalanced(s));

    }
}
