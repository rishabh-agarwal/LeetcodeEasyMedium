package org.question.pratice;

import java.util.Arrays;

//3.	Write a Java program to implement a binary search algorithm for a sorted array of integers.
public class BinarySearch {

    public static void main(String[] args){
        int[] array = {7, 9, 16, 16, 21, 23, 1, 4,25};
        int target = 7;
        Arrays.sort(array);
        System.out.println("sorted Array is: " );
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
        System.out.println("index for the target "+ target + " is: "+ Arrays.binarySearch(array, target));
    }
}
