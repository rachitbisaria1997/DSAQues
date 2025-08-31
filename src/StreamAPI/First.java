package StreamAPI;
import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class First {

    public void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        for(int num : evenNumbers){
            System.out.print(num);
        }

        Optional<Integer> max = numbers.stream().max(Integer::compare);

        System.out.println(max.get());

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.print(sum);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        for(String name : upperNames){
            System.out.print(name + " ");
        }

        List<Integer> sortedNums = numbers.stream().sorted().collect(Collectors.toList());

        long count = numbers.stream().filter(n -> n > 5).count();
        System.out.println(count);

        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        for(int i : distinctNumbers){
            System.out.print(i + "  ");
        }

        int total = numbers.stream().reduce(0, Integer::sum);
        System.out.print(total);

        Optional<Integer> anyELement = numbers.stream().findAny();

        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris",
                "Charlie Lou");
        List<String> firstNames = fullNames.stream().map(name -> name.split(" ")[0]).collect(Collectors.toList());

        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.print(allPositive);

        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);

        Optional<Integer> first = numbers.stream().findFirst();

        List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());

        List<Integer> skipped = numbers.stream().skip(2).collect(Collectors.toList());

        Set<Integer> uniqueNum = numbers.stream().collect(Collectors.toSet());

        IntSummaryStatistics statistics = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();

        System.out.print(statistics);

        List<Integer> numberss = Arrays.asList(10, 20, 30, 40);
        int ssum = numberss.stream().reduce(0, (a, b) -> a + b);
        System.out.print(ssum);

        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> longestStr = strings.stream().max(Comparator.comparingInt(String::length));

        System.out.println(longestStr);

        List<Integer> nums = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containsPrime = nums.stream().anyMatch(this::isPrime);

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        List<Integer> numWithDuplicates = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());

        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3;

        int kthSmall = Arrays.stream(array).sorted().skip(k-1).findFirst().orElse(-1);
        System.out.println(kthSmall);

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");

        Map<String, Long> wordFreq = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Map.Entry<String, Long> freq : wordFreq.entrySet()){
            System.out.println(freq.getKey() + "  "+ freq.getValue());
        }

        List<Integer> arr = Arrays.asList(1,2,3,1,2);
        Optional<Integer> firstNonRep = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                                            .entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst();

        if(firstNonRep.isPresent()){
            System.out.println(firstNonRep);
        }

        Optional<Integer> firstRep = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst();

        if(firstRep.isPresent()){
            System.out.println(firstRep);
        }

    }

    public boolean isPrime(int num){

        if(num <= 1){
            return false;
        }
        for(int i=2; i<= num; i++){

            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
