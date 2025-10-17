package LinkedList;

import java.util.HashSet;

public class LenofLoop {

    static int lengthOfLoop(Node head){
        HashSet<Node> visited = new HashSet<>();
        int count = 0;
        Node current = head;

        while (current != null){

            if(visited.contains(current)){
                Node startOfLoop = current;
                do{
                    count++;
                    current = current.next;
                }
                while (current != startOfLoop);
                return count;
            }
            else {
                visited.add(current);
            }
            current = current.next;
        }
        return 0;
    }

    public static void main(String[] args) {

        Node head = new Node(25);
        head.next = new Node(14);
        head.next.next = new Node(19);
        head.next.next.next = new Node(33);
        head.next.next.next.next = new Node(10);

        head.next.next.next.next.next = head.next.next;

        System.out.println(lengthOfLoop(head));

    }
}
