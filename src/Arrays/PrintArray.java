package Arrays;

import java.util.*;

public class PrintArray {

    public static void main(String[] args){

        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(8);
        al.add(9);
        al.add(12);
        al.add(6);

        // print like
        //1 12
        // 3 9
        // 6 8


        Collections.sort(al);

        int start = 0;
        int end = al.size() - 1;

        while(start <= end){

            if(start ==  end){
                System.out.println(al.get(start));
            }
            else{
                System.out.println(al.get(start) + "  "+ al.get(end) + "  ");
            }

            start++;
            end--;
        }

    }

}
