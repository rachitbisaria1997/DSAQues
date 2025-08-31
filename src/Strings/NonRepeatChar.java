package Strings;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatChar {

    public static void main(){
        String str = "swiss";

        Character firstNonRep = str.chars().mapToObj(c -> (char) c)
                                           .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                                                   Collectors.counting())).entrySet().stream().
                                             filter(entry -> entry.getValue() == 1)
                                            .map(Map.Entry::getKey).findFirst().orElse(null);


        Optional<Character> firstNonRp = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(e -> e.getKey()).findFirst();



        System.out.println(firstNonRep);

    }
}
