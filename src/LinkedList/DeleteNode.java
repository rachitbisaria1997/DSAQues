package LinkedList;

public class DeleteNode {


    static Node deleteBegin(Node head)
    {
        if(head == null){
            System.out.println("list is empty");
            return null;
        }
        return head.next;
    }

    static void printNode(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static Node deleteFromEnd(Node head){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteByValue(Node head, int value){

        if(head == null){
            return null;
        }

        if(head.data == value){
            head = head.next;
        }

        Node temp = head;
        while (temp.next.data  != value){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }


    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);

        head = deleteBegin(head);

        printNode(head);

        System.out.println("------");

        head = deleteFromEnd(head);

        printNode(head);

    }
}
