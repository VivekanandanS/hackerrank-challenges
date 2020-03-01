package com.hackerrank.sorting;

import java.util.Arrays;

public class FraudulentActivityNotifications {

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

    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static int medianOfMedians(int[] array, int startIndex, int endIndex, int ithElement) {

        System.out.println(Arrays.toString(array));
        System.out.println(startIndex);
        System.out.println(endIndex);
        System.out.println(ithElement);
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


    static int activityNotifications(int[] expenditure, int d) {


        int NOTIFY = 0;
        System.out.println(expenditure.length + " hi " + d);
        for (int i = 0; i < expenditure.length; i++) {
            if (i < d)
                continue;
            int median = 0;
            System.out.println("hi " + i);
            int[] temp = Arrays.copyOfRange(expenditure, i - d, i);
            if (d % 2 == 0) {
                median = (medianOfMedians(temp, 0, d - 1, d / 2) +
                        medianOfMedians(temp, 0, d - 1, (d / 2) + 1)
                ) / 2;
            } else
                median = medianOfMedians(temp, 0, d - 1, d / 2);


            System.out.println("medoa " + median);
            if (expenditure[i] >= (2 * median))
                NOTIFY++;
        }
        return NOTIFY;
    }

    public static void main(String[] args) {

        /** TEST CASE 0 **/
        int d = 4;
        int[] expenditure = new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5};

        /** TEST CASE 1 **/
        d = 3;
        expenditure = new int[]{10, 20, 30, 40, 50};

        /** TEST CASE 2 **/
        d = 4;
        expenditure = new int[]{1, 2, 3, 4, 4};

        System.out.println(activityNotifications(expenditure, d));
    }

}
