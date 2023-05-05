package org.question.pratic.hubspot;

import java.util.HashMap;
import java.util.Map;

//input: inengineering
//n: 2 (size of substring)
//
public class hubspotIntervieAskedQuestion {
    public static void main(String[] args) {
        //sudo code
        //s = inengineering
        //Hashmap<substring, count>
        //iterate through the length of the string
        //check substring from itr, 2
        //if check if it exist in map
        //get its count and update the count
        //put it into the map
        //1,2,3,4,5
        //5 + 3=2

        //corner scenario
        //"",0
        //"123",4
        returnMostOccuringSubstring("inengineering", 3);
    }
    public static String returnMostOccuringSubstring(String s, int n){
        Integer maxValue =null;
        String maxKey = null;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<s.length()-(n-1); i++){ //n
            String subString = s.substring(i, i+n);
            if(map.containsKey(subString)){
                int subStringCount = map.get(subString);
                subStringCount+=1;
                map.put(subString, subStringCount);
            }
            else
                map.put(subString, 1);
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){ //n
            if(maxValue==null|| entry.getValue()>maxValue){
                maxValue =entry.getValue();
                maxKey=entry.getKey();
            }
        }
        return maxKey;

    }
}
