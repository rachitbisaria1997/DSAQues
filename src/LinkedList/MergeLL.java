//package LinkedList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//
//public class MergeLL {
//
//    static ListNode mergeTwoLists(Node l1, Node l2){
//
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        ListNode dummy = new ListNode(-1), curr = dummy;
//
//        while(l1 != null && l2 != null){
//
//            if(l1.val < l2.val){
//                curr.next = l1;
//                l1 = l1.next;
//            }
//            else{
//                curr.next = l2;
//                l2 = l2.next;
//            }
//
//            curr = curr.next;
//        }
//
//        curr.next = (l1 != null) ? l1 : l2;
//        return dummy.next;
//    }
//
//    public static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " -> ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//
//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(3);
//        list1.next.next = new ListNode(5);
//
//        // List 2: 2 -> 4 -> 6
//        ListNode list2 = new ListNode(2);
//        list2.next = new ListNode(4);
//        list2.next.next = new ListNode(6);
//
//        ListNode merged = mergeTwoLists(list1, list2);
//        printList(merged);
//
//    }
//
//}
