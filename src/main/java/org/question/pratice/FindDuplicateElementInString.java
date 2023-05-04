package org.question.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElementInString {

    public static void main(String[] args){
        String s = "Ishika Agarwal Ruchi Agarwal Rakesh Agarwal Rishabh Agarwal";
        String[] s2 = s.split(" ");
        List<String> stringList = new ArrayList<>();
        Arrays.stream(s2).forEach(s2s -> stringList.add(s2s));

        Map<String, Long> stringMapCount = stringList.stream().collect(Collectors.groupingBy(String -> String, Collectors.counting()));
        stringMapCount.entrySet().stream().filter(string -> string.getValue()>1).forEach(System.out::println);

        // for characters//
        String c = "Rishabh Agarwal";
        char[] arr = c.toCharArray();
        List<Character> list = new ArrayList<>();

        for(char a: arr)
            list.add(a);

        Map<Character, Long> charMapCount = list.stream().collect(Collectors.groupingBy(String -> String, Collectors.counting()));
        charMapCount.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
    }
}
