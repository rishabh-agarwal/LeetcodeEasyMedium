package org.question.pratice;
//5.	Write a Java program to check if a given string is a palindrome or not.
public class Palindrome {
    public static void main(String[] args){
        String str = "racecar";
        StringBuilder reverStr = new StringBuilder(str).reverse();

        if(reverStr.toString().equals(str)){
            System.out.println("It is a palindrome!");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
