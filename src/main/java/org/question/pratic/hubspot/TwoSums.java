package org.question.pratic.hubspot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    //Given an array of integers and a number n, return true/false if there is a pair that sums to that number.
    public static boolean main(String[] args) {
        int[] arr = {4,7,1,6,7,8};
        int target = 14;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(i->{
            if(map.containsKey(target-i)){
                System.out.println(i+ ","+ (target-i));
            }
            map.put(i, target-i);
        });
        if(map.isEmpty())
            return false;
        else
            return true;
    }
}
