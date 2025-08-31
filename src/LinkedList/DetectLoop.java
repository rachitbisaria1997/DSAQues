package LinkedList;

//class Node {
//
//    int data;
//    Node next;
//
//    Node(int x) {
//        this.data = x;
//        this.next = null;
//    }
//}

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
