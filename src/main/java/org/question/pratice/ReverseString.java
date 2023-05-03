package org.question.pratice;

public class ReverseString {
    public static void main(String[] args){
        String s = "String to be reverse";
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println("Original string: "+ s);
        System.out.println("Reverse string: "+ stringBuilder.reverse());
    }
}