package org.question.pratic.hubspot;

import java.util.Arrays;

public class LowestNElement {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        System.out.println(Arrays.toString(lowestNElements(array1, array2, 4)));
    }
    public static int[] lowestNElements(int [] array1, int[] array2, int length){
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array1, 0, result, array1.length, array2.length);
        Arrays.sort(result);
        return Arrays.copyOf(result, length);
    }
}
