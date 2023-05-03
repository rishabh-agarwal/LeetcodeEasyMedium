package org.question.pratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//4.	Implement a Java program to find the second largest number in an array of integers.
public class FindSecondLargest {
    public static void main(String[] args){
        int[] array = {10, 5, 20, 8, 15};

        // Convert the array to a list
        List<Integer> arrList = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(arrList);
        Collections.reverse(arrList);
        arrList.stream().forEach(a -> System.out.print(a + " "));
        System.out.println("\n");
        // Find the second largest element using a lambda expression
        int secondMax = arrList.stream().distinct().skip(1).findFirst().orElse(Integer.MIN_VALUE);

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is " + secondMax + ".");
        }
    }
}
