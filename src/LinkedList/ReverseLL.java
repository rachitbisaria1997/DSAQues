package LinkedList;

class NodeNew {

    int data;
    NodeNew next;

    NodeNew(int x) {
        this.data = x;
        this.next = null;
    }
}

public class ReverseLL {

    public NodeNew reverseList(NodeNew head){

        NodeNew prev = null;
        NodeNew current = head;
        NodeNew next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

    }
}
