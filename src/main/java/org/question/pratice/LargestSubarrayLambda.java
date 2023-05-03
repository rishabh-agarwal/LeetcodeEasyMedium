package org.question.pratice;

import java.util.Arrays;
//Given an array of integers, find the largest contiguous subarray sum.
public class LargestSubarrayLambda {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxSum = Arrays.stream(arr)
                .reduce((sum, i) -> sum > 0 ? sum + i : i)
                .getAsInt();
        System.out.println("Maximum contiguous subarray sum is: " + maxSum);
    }
}
