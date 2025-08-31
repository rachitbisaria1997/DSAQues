package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDup {

    public static void main(String[] args) {

        int [] arr = {1,2,2,4};
        System.out.println(containsDuplicate(arr));

    }


    public static boolean containsDuplicate(int [] arr){

        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
