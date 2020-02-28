package com.hackerrank.sorting;

import java.util.Arrays;

/**
 * 1. Divide the array to 5 sub array
 * 2. Sort the sub arrays and find their median
 */
public class MedianOfMedians {

    public static int findMedian(int[] array, int start, int end) {
        int median = (end - start) / 2;
        System.out.println(start + " " + end);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, start, end);
        System.out.println(Arrays.toString(array));
        return array[median];
    }

    public static int medianOfMedians(int[] array, int startIndex, int endIndex, int ithElement) {

        if (ithElement > 0 && ithElement < endIndex - startIndex + 1) {
            int numberOfElements = endIndex - startIndex + 1;
            int i;
            int[] medians = new int[(numberOfElements + 4 / 5)];
            for (i = 0; i < numberOfElements / 5; i++) {
                medians[i] = findMedian(array, startIndex + (i * 5), startIndex + (i * 5) + 5);
            }

            if (numberOfElements % 5 > 0) {
                medians[i] = findMedian(array, startIndex + (i * 5), startIndex + (i * 5) + (numberOfElements % 5));
            }

            int medianOfMedians = medians.length == 1 ? medians[i] : medianOfMedians(medians, 0, i, i / 2);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {25, 21, 98, 100, 76, 22, 43, 60, 89, 87};
        medianOfMedians(arr, 0, arr.length - 1, 4);
    }
}
