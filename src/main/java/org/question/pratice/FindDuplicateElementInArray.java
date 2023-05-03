package org.question.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Find the duplicate
public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 8, 15, 10, 20, 5);
        Map<Integer, Long> counts = list.stream().collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        counts.entrySet().stream().filter(e -> e.getValue()>1).forEach(System.out::println);

    }
}
