package com.techdelight.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array and positive number k , Check whether the array contains any duplicate elements within
 * range k. If k is more than the size of array , the solution
 * should check for duplicates in the complete array.
 * <p>
 * For example,
 * <p>
 * A[] = {5, 6, 8, 2, 4, 6, 9}
 * K = 4;
 * <p>
 * Duplicates found,
 * <p>
 * 6 is repeated at a distance 4 which is <= K
 */

public class DuplicateInRange {

    public static int findDuplicate(int[] arr, int k) {
        Map<Integer, Integer> postionIndex = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (postionIndex.containsKey(arr[i]) && (i - postionIndex.get(arr[i]) >= k))
                return arr[i];
            postionIndex.put(arr[i], i);
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 8, 2, 4, 6, 9};
        int k = 4;
        System.out.println(findDuplicate(arr,k));
    }
}
