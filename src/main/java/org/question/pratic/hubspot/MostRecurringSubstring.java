package org.question.pratic.hubspot;

import java.util.HashMap;
import java.util.Map;

public class MostRecurringSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";
        mostRecurringSubstring(input, 3);
    }
    public static void mostRecurringSubstring(String string, int length){
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<string.length() - length; i++){
            String substring = string.substring(i, i+length);
            int n = map.getOrDefault(substring,0);
            map.put(substring, n+1);
        }

        System.out.println("-----");
        map.entrySet().stream().forEach(System.out::println);
        System.out.println("-----");
    }
}
