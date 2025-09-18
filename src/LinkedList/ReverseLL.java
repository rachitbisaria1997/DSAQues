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

    public void printList(NodeNew head){

        NodeNew temp = head;
        while(temp != null){
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        NodeNew head = new NodeNew(1);
        head.next = new NodeNew(2);
        head.next.next = new NodeNew(3);
        head.next.next.next = new NodeNew(4);
        head.next.next.next.next = new NodeNew(5);

        ReverseLL obj = new ReverseLL();

        NodeNew newHead = obj.reverseList(head);
        obj.printList(newHead);

    }
}
