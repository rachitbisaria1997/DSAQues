package Arrays;
import java.util.*;
import java.util.stream.Collectors;

class ClosestKElements {

    public static int[] printKClosest(int[] arr, int k, int x){
        Map<Integer, Integer> map = new HashMap<>();
        int[] closest = new int[k];

        for (int i : arr) {
            int diff = Math.abs(i - x);
            map.put(i, diff);
        }
        // sort by value in hashmap
        Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) // ascending order of closeness
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        Map<Integer, Integer> sortedMapp = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                                              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1
                                              , LinkedHashMap::new));


        int index = 0;
        for(Integer key : sortedMap.keySet()){

            if(index < k){
                closest[index++] = key;
            }

        }

        return closest;
    }


   public static void main(String[] args){
       int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
       int k = 4;
       int x = 35;

       int [] res = printKClosest(arr, k, x);

       for(int i : res){
           System.out.print(i + " ");
       }
   }
}
