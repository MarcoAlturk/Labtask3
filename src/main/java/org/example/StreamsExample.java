package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void Q4main() {
        List<Integer> numbers = Arrays.asList(3, 7, 12, 5, 20, 2);


        double average = numbers.stream()
                .mapToDouble(n -> n * n * n)
                .filter(n -> n > 500)
                .average()
                .orElse(0);

        System.out.println("\nOutput is " + average);

        // double each element in list
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        // finding sum
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // find maximum element in a list
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);

        // get all the pairs in a list
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // find most repeated element in a list
        List<Integer> numbers6 = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Map<Integer, Long> counts = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Integer> mostRepeated = counts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

    }
}



