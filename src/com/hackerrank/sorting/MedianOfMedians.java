package com.hackerrank.sorting;

import java.util.Arrays;

/**
 * 1. Divide the array to 5 sub array
 * 2. Sort the sub arrays and find their medians
 * 3. Find median of Medians
 * 4.
 */
public class MedianOfMedians {

    public static int findMedian(int[] array, int start, int end) {
        int median = (end + start) / 2;
        Arrays.sort(array, start, end);
        return array[median];
    }

    public static int partition(int[] arr, int low, int high, int pivot) {

        int i = low;
        int pivotIndex = low;
        for (i = low; i <= high; i++) {
            if (arr[i] == pivot)
                pivotIndex = i;
        }

        System.out.println(pivotIndex);
        arr = swap(arr, pivotIndex, high);
        i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;

            }
        }
        arr = swap(arr, i, high);
        return i;

    }


    public static int medianOfMedians(int[] array, int startIndex, int endIndex, int ithElement) {
        System.out.println(Arrays.toString(array));
        System.out.println();

        int numberOfElements = endIndex - startIndex;
        int i;
        int[] medians = new int[((numberOfElements + 4) / 5)];
        for (i = 0; i < numberOfElements / 5; i++) {
            medians[i] = findMedian(array, startIndex + (i * 5), startIndex + (i * 5) + 5);
        }
        if (i * 5 < numberOfElements) {
            medians[i] =
                    findMedian(array, startIndex + i * 5, startIndex + (i * 5) + (numberOfElements % 5));
        }
        int medianOfMedians = medians.length == 1 ? medians[0] : medianOfMedians(medians, 0, medians.length - 1, (medians.length - 1) / 2);
        int indexOfMoM = partition(array, startIndex, endIndex, medianOfMedians);
        if ((indexOfMoM == ithElement))
            return array[indexOfMoM];
        if (indexOfMoM > ithElement)
            return medianOfMedians(array, startIndex, indexOfMoM - 1, ithElement);
        return medianOfMedians(array, indexOfMoM, endIndex, ithElement);

    }

    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(medianOfMedians(arr, 0, arr.length - 1, 0));
    }
}
