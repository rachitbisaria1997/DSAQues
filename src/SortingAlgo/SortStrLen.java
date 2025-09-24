package SortingAlgo;

import java.util.*;

class LengthComparator implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

public class SortStrLen {

    public static void main(String[] args) {

        String[] arr = {"GeeksforGeeks", "I", "from", "am"};

        Arrays.stream(arr).sorted(Comparator.comparingInt(String::length).reversed()).forEach(str -> System.out.print(str + "  "));

        List<String> names = new ArrayList<String>(List.of("Ant", "Cat", "Ball", "Elephant"));

        Collections.sort(names, new LengthComparator());

        System.out.println(names);

    }

    //

}
