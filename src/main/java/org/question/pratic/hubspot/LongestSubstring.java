package org.question.pratic.hubspot;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
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
