package com.practice.misc;

import java.util.Arrays;

public class QuickSort {

	public static int partition(int[] arr, int low, int high) {
		
		int pivot = high;
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= arr[pivot]) {
				i++;
				arr = swap(arr, i, j);
			}
		}
		arr = swap(arr, i + 1, pivot);
		return  i + 1;
	}

	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static int[] sort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);
			System.out.println(pivot);
			sort(arr, low, pivot - 1);
			sort(arr, pivot + 1, high);

		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 50, 23, 9, 18, 61, 32 };
		System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));

	}
}
