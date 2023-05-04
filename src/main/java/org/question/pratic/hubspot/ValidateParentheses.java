package org.question.pratic.hubspot;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateParentheses {
    public boolean isValid(String s) {
        char[] charArr = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();
        if(charArr.length<2)
            return false;
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
