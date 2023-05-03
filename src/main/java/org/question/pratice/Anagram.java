package org.question.pratice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String first = "silent";
        String second = "listen";

        first = first.toLowerCase();
        second = second.toLowerCase();

        char[] firstCharArr = first.toCharArray();
        char[] secondCharArr = second.toCharArray();

        Arrays.sort(firstCharArr);
        Arrays.sort(secondCharArr);

        System.out.println(Arrays.toString(firstCharArr));
        System.out.println(Arrays.toString(secondCharArr));

        if(Arrays.compare(firstCharArr, secondCharArr)==0){
            System.out.println("String is an anagram.");
        }
        else
            System.out.println("String is not an anagram.");
    }
}
