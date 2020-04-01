package com.techdelight.arrays;

import java.util.Arrays;

/**
 * Find the longest alternating subarry in the given input,
 * <p>
 * For example ,
 * <p>
 * 1, -2, 6, 4, -3, 2, 4, -3
 * <p>
 * Here the longest alternating subarry is { 4, -3, 2, 4 }
 */
public class LongestAlternatingSubArray {


    public static int[] find(int arr[]) {

        int endIndex = 0;
        int currentLength = 0;
        int maxLength = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] * arr[i - 1] > 0) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i;
                }

            } else
                currentLength = 1;

        }
        return Arrays.copyOfRange(arr, endIndex - maxLength, endIndex);
    }


    public static int kandanesAlgorithm(int arr[]) {
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max_ending_here = Math.max(arr[i], max_ending_here + arr[i]);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
        }
        return max_so_far;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 6, 4, -3, 2, -4, -3};
        System.out.println();
        find(arr);

    }

}
