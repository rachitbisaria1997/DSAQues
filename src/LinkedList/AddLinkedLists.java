package LinkedList;

public class AddLinkedLists {

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node addLists(Node l1, Node l2) {

        l1 = reverse(l1);
        l2 = reverse(l2);

        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        // Step 2: Add digits one by one
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        // Step 3: Reverse result to restore proper order
        return reverse(dummy.next);

    }

    public static void printList(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node L1 = new Node(1);
        L1.next = new Node(1);
        L1.next.next = new Node(2);
        L1.next.next.next = new Node(3);

        Node L2 = new Node(4);
        L2.next = new Node(5);
        L2.next.next = new Node(6);

        Node L3 = addLists(L1, L2);

        System.out.print("L1: "); printList(L1);
        System.out.print("L2: "); printList(L2);
        System.out.print("L3: "); printList(L3);
    }

}
