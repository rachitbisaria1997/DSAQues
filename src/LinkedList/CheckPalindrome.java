package LinkedList;

import java.util.Stack;

public class CheckPalindrome {

    public static boolean isPalindrome(Node head){
        Node current = head;
        StringBuilder sb = new StringBuilder();

        while (current != null){
            String val = String.valueOf(current.data);
            sb.append(val);
            current = current.next;
        }

        return sb.toString().equals(sb.reverse().toString());
    }

    public static boolean isPalin(Node head){
        Node current = head;
        Stack<Integer> stack = new Stack<>();

        while (current != null){
            stack.push(current.data);
            current = current.next;
        }

        while (head != null){
            int c = stack.pop();

            if(c != head.data){
                return false;
            }

            head = head.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        //head.next.next.next.next.next = new Node(2);


        boolean result = isPalin(head);

        if (result)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
