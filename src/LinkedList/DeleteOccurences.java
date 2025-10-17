package LinkedList;

public class DeleteOccurences {

    static Node deleteOccurrences(Node head, int key) {

        Node curr = head, prev = null;

        while (curr != null) {

            if (curr.data == key) {

                if (prev == null) {
                    head = curr.next;
                }

                else {
                    prev.next = curr.next;
                }
                curr = curr.next;

            }

            else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    public static void printList(Node head){
        while (head != null){
            System.out.print(" " + head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(2);

        int key = 2;

        head = deleteOccurrences(head, key);
        printList(head);
    }

}
