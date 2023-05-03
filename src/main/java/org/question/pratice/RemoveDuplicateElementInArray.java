package org.question.pratice;

import java.util.Arrays;

//6.	Implement a Java method to remove duplicate elements from an array of integers.
public class RemoveDuplicateElementInArray {

    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15, 10, 20, 5};

        int[] distinctArray = Arrays.stream(array).distinct().toArray();

        System.out.println(Arrays.toString(distinctArray));
    }
}
