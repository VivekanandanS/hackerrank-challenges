package com.afteracademy.problems;

import java.util.Arrays;

/**
 * @author vivekanandan.sakthiv on Mar 2021
 * <p>
 * Given an unsorted array arr[] of size n, write a program to find the max (j - i) difference between indices such
 * that j > i and arr[j] > arr[i] .
 * <p>
 * Example 1
 * <p>
 * Input: arr[] = [72, 8, 10, 3, 2, 81, 30, 1, 32]
 * Output: 7 (j = 8, i = 1)
 * Explanation: max(j - i) = 8 - 1 = 7 such that 8 > 1 and arr[8] > arr[1] are true.
 * Example 2
 * <p>
 * Input: arr[] = [5, 2, 3, 5, 4, 6, 7, 8, 19, 0]
 * Output: 8 (j = 8, i = 0)
 * Explanation: max(j - i) = 8 - 0 = 8 such that 8 > 0 and arr[8] > arr[0] are true.
 * Example 3
 * <p>
 * Input: arr[] = [0, 2, 3, 4, 5, 8, 9]
 * Output: 6 (j = 6, i = 0)
 * Explanation: In an array sorted in increasing order, the max(j - i) is the difference between last and first index.
 * Here, max(j - i) = 6 - 0 such that 6 > 0 and arr[6] > arr[0] are true.
 * Example 4
 * <p>
 * Input: arr[] = [11, 8, 5, 4, 2, 1]
 * Output: -1
 * Explanation: In an array sorted in decreasing order, it is not possible to have max(j - i) such
 * that arr[j] > arr[i] and j > i. So, the answer is -1.
 */


public class MaxOfJandI {

    public static void main(String[] args) {
        int[] EXAMPLE1 = {72, 8, 10, 3, 2, 81, 30, 1, 32};
        int[] EXAMPLE2 = {5, 2, 3, 5, 4, 6, 7, 8, 19, 0};
        int[] EXAMPLE3 = {0, 2, 3, 4, 5, 8, 9};
        int[] EXAMPLE4 = {11, 8, 5, 4, 2, 1};
        System.out.println(solve(EXAMPLE4));
    }

    /**
     * 2 pass approach
     *
     * @param arr
     * @return
     */
    public static int solve(int[] arr) {
        int[] minAtPosition = new int[arr.length];
        int[] maxAtPosition = new int[arr.length];

        minAtPosition[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minAtPosition[i - 1]) {
                minAtPosition[i] = arr[i];
            } else {
                minAtPosition[i] = minAtPosition[i - 1];
            }
        }


        maxAtPosition[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxAtPosition[i + 1]) {
                maxAtPosition[i] = arr[i];
            } else {
                maxAtPosition[i] = maxAtPosition[i + 1];
            }
        }
        System.out.println(Arrays.toString(minAtPosition));
        System.out.println(Arrays.toString(maxAtPosition));
        int maxIndex = 0;
        int minIndex = 0;
        int result = 0;
        while (minIndex < arr.length && maxIndex < arr.length) {
            if (maxAtPosition[maxIndex] > minAtPosition[minIndex])
                maxIndex++;
            else
                minIndex++;
            if ((maxIndex - minIndex) > result)
                result = maxIndex - minIndex;
        }

        return result > 0 ? result : -1;
    }
}
