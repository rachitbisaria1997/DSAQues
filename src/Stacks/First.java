package Stacks;

public class First {

    static final int MAX_SIZE = 101;
    static int[] a = new int[MAX_SIZE];
    static int top = -1;

    static void push(int ele){
        if(top < MAX_SIZE - 1){
            top++;
            a[top] = ele;
            System.out.println("pushed element "+ ele);
        }
        else{
            System.out.println("stack is full. cannot push "+ ele);
        }
    }

    static int pop(){
        if(top >= 0){
            int ele = a[top];
            top--;
            System.out.println("popped element "+ ele);
            return ele;
        }
        else{
            System.out.println("stack is empty, cannot empty");
            return -1;
        }
    }

    static boolean isEmpty(){
        return top == -1;
    }
    
    static boolean isFull(){
        return top >= MAX_SIZE;
    }

    static int peek(){
        if(top >=0){
            return a[top];
        }
        else{
            System.out.println("Stack is empty. No top element.");
            return -1;
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);
        push(40);

        System.out.println("top elememt is " + peek());

        pop();
        pop();
        pop();

        System.out.println(isEmpty());
    }

}
