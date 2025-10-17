package LinkedList;

import java.util.HashSet;

public class DetectLoop {

    static boolean detectLoop(Node head){
        Node slow = head, fast = head;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    static boolean detLoop(Node head){
        HashSet<Node> visited = new HashSet<>();

        while (head != null){
            if(visited.contains(head)){
                return true;
            }
            visited.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        head.next.next.next = head.next;

        if(detectLoop(head)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }

}
