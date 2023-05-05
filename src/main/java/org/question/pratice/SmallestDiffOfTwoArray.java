package org.question.pratice;

public class SmallestDiffOfTwoArray {
    //has context menuComposeParagraph
    //given 2 arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.
    //
    //EXAMPLE:
    //input : {1,3,15,11,2}, {23,127,235,19,8}
    //sorted: {1,2,3,17,18},{8,18,23, 127, 235}
    //output: 3. that is the pair (11,8)
    public static void main(String[] args) {
        //first arr i -> arr j
        // absolute
        //min = Integer.MAX
        // min > 0 = min
        // min > 0 smaller the min = min
        int[] arr1 = {1,3,15,11,2};
        int[] arr2 = {23,127,235,19,8};
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr1.length; i++){//n
            for(int j=0; j<arr2.length; j++){//n
                int diff = Math.abs(arr2[j]-arr1[i]);
                if(diff < min){
                    min = diff;
                }
            }
        }

        System.out.println("Min diff: "+ min);

        //Arrays.sort(arr1)
        //Arrays.sort(arr2)
    }
}
