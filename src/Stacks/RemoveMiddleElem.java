package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveMiddleElem {

    public static void deleteMid(Stack<Integer> st, int size){

        ArrayList<Integer> al = new ArrayList<>();

        while(!st.isEmpty()){
            al.add(st.pop());
        }

        int mid = size / 2;

        al.remove(mid);

        for(int i=0; i < al.size(); i++){
            st.push(al.get(i));
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int size = st.size();

        deleteMid(st, size);

        while(!st.isEmpty()){
            int p = st.pop();
            System.out.println(p + "  ");
        }
    }

}
