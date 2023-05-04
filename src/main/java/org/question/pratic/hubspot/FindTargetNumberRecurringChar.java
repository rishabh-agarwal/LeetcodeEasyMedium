package org.question.pratic.hubspot;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Write a small application (I choose to do it in Java) to find, given an input string S, and an input number X, which X letters were repeating more in S
public class FindTargetNumberRecurringChar {
    public static void main(String[] args) {
        String input = "aaaaabbbbbbooooollllltttmmmmm";
        int target = 3;
        List<Character> list = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Map<Character, Long> mapCount = list.stream()
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));

        System.out.println("Value matching to the target "+ target + " are: ");
        mapCount.entrySet().stream().filter(e -> e.getValue()==target).forEach(System.out::println);

        System.out.println("Value more than the target "+ target + " are: ");
        mapCount.entrySet().stream().filter(e -> e.getValue()>target).forEach(System.out::println);

    }
}
