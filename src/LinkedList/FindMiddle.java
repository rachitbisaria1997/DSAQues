package LinkedList;

class NNode{
    int data;
    Node next;

    NNode(int x){
        this.data = x;
        this.next = null;
    }

    static int getMiddle(Node head){

        int length = getLength(head);
        int middle = length / 2;

        for(int i=0; i < middle; i++){
            head = head.next;
        }
        return head.data;
    }

    static int getLength(Node head){

        int length = 0;
        while(head != null){

            length++;
            head = head.next;
        }
        return length;
    }
}

public class FindMiddle {
//
//    NNode head = new NNode(10);
//    head.next = new NNode(20);
//    head.next.next = new NNode(30);
//    head.next.next.next = new NNode(40);
//    head.next.next.next.next = new NNode(50);
//    head.next.next.next.next.next = new NNode(60);

}

