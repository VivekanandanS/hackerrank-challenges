package com.hackerrank.arrays;

import java.util.Arrays;

public class RightRotation {

    public static int[] rotateRight(int[] array, int rotations) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[(i + array.length + rotations ) % array.length] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 6, 7, 9};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rotateRight(arr,2)));
    }
}
