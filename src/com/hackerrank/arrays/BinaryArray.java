package com.hackerrank.arrays;

import java.util.Arrays;

public class BinaryArray {

    public static int[] arr = new int[]{0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1};

    public static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] != arr[j]) {
                if (arr[i] != 0)
                    swap(i, j);
                i++;
                j--;
                continue;
            }

            if (arr[i] == 0)
                i++;

            if (arr[j] == 1)
                j--;

        }
        System.out.println(Arrays.toString(arr));

    }
}
