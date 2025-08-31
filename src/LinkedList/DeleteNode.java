package LinkedList;

class LNode{

    int data;
    LNode next;

    LNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeleteNode {

    LNode head;

    void deleteBegin()
    {
        if(head == null){
            head = head.next;
        }
    }

    void deleteFromEnd(){

       // Node temp = head;
//        while(temp.next.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = null;
    }

    void deleteByValue(int value){

        if(head == null){
            return;
        }

  //      Node temp = head;
        if(head.data == value){
            head = head.next;
            return;
        }

//        while(temp.next != null && temp.next.data != value){
//            temp = temp.next;
//        }
//
//        temp.next = temp.next.next;
    }

}
