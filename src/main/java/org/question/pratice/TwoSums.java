package org.question.pratice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15, 10, 20, 5};
        int target = 30;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target-nums[i], i);
        }

        return null;
    }
}
