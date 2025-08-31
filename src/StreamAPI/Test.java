package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<List<Integer>> balloons = new ArrayList<>();

        balloons.add(Arrays.asList(10, 16));
        balloons.add(Arrays.asList(7, 12));
        balloons.add(Arrays.asList(1, 6));
        balloons.add(Arrays.asList(2, 8));
        balloons.add(Arrays.asList(1, 2));
        balloons.add(Arrays.asList(2, 3));
        balloons.add(Arrays.asList(5, 6));

        balloons.sort(Comparator.comparingInt(a -> a.get(1)));

        int arrowCount = 0;
        int arrowPos = Integer.MIN_VALUE;

        balloons.sort(Comparator.comparingInt(a -> a.get(1)));

        for(List<Integer> ballon : balloons){
            int start = ballon.get(0);
            int end = ballon.get(1);

            if(start > arrowPos){
                arrowCount++;
                arrowPos = end;
            }
        }

        System.out.println(arrowCount);

    }

}
