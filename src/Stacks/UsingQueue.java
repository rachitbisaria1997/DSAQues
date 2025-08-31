package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        q1.add(x);

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }

    }

    public int pop(){
        return q1.remove();
    }

    public int top(){
        return q1.peek();
    }

    public boolean isEmpty(){
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        UsingQueue obj = new UsingQueue();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        System.out.println(obj.top());
        System.out.println(obj.pop());

    }

}
