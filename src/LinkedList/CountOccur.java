package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountOccur {

    static int count(Node head){
        if(head == null){
            return 0;
        }
        int ans = 0;
        Node temp = head;
        while(temp != null){
            ans++;
            temp = temp.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);


        System.out.println(count(head));

    }
}
