package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindPairs {

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head){
        ArrayList<ArrayList<Integer> > ans
                = new ArrayList<>();
        Node current = head;
        HashSet<Integer> visited = new HashSet<>();

        while (current != null){
            int x = target - current.data;
            if(visited.contains(x)){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(current.data);
                pair.add(x);
                ans.add(pair);
            }
            else{
                visited.add(current.data);
            }
            current = current.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        int target = 7;
        ArrayList<ArrayList<Integer> > pairs
                = findPairsWithGivenSum(target, head);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        }
        else {
            for (ArrayList<Integer> pair : pairs) {
                System.out.println(pair.get(0) + " "
                        + pair.get(1));
            }
        }
    }
}
