package org.question.pratic.hubspot;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Write a function that takes a string of characters and an integer n and returns the most frequent n-gram. Example: for ‘abcdabxe’ and 2 returns ‘ab’. If there are more than one with the same frequency, return the first one you encountered.
public class LongestSubstring {
    public static void main(String[] args) {
        lengthOfLongestSubstring("abcdabxe");
    }
    public static int lengthOfLongestSubstring(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            for(int j=i+2; j<s.length(); j++){
                int count = map.getOrDefault(s.substring(i,j),0);
                count+=1;
                map.put(s.substring(i,j),count);
            }
        }
        System.out.println("Longest substring key: "+ Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());
        System.out.println("Longest substring value: "+ Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue());
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
    }
}
