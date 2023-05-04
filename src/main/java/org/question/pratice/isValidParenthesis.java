package org.question.pratice;

import java.util.HashMap;
import java.util.Stack;

class isValidParenthesis {
    public boolean isValid(String s) {
        char[] charArr = s.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        if(charArr.length<2)
            return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<charArr.length; i++){
            if(map.containsValue(charArr[i]))
                stack.push(charArr[i]);
            else if(stack.peek().equals(map.get(charArr[i])))
                stack.pop();
            else
                return false;
        }
        return true;
    }
}
