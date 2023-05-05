package org.question.pratic.hubspot;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {3,4,5,6,7};
        int[] c = new int[a.length+ b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
}
