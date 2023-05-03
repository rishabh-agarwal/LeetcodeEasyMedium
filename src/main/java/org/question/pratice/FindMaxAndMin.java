package org.question.pratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//2.	Implement a Java method to reverse a string using recursion.
public class FindMaxAndMin {
    public static void main(String[] arr) {
        int[] integerArray={113,23422,33,4,51};
        List<Integer> intList = Arrays.stream(integerArray).boxed().collect(Collectors.toList());
        System.out.println("Max Number is: "+ Collections.max(intList));
        System.out.println("Min Number is: "+ Collections.min(intList));
    }
}
