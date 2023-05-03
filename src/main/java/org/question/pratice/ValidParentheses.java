package org.question.pratice;

import java.util.Stack;

public class ValidParentheses {
        public static void main(String[] args) {
            String s = "()(()))))";
            char[] charArr = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            int num = 0;
            for(int i=0; i<charArr.length; i++){
                if(charArr[i]=='(')
                    stack.push(charArr[i]);
                else if (charArr[i] ==')' && stack.peek()=='('){
                    num+=1;
                    System.out.print(stack.peek() + " " + charArr[i] + " ");
                }
            }
            System.out.println("Total number of valid parentheses: "+num);
        }
}
