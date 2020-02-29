package main.com.preparation.search;

import java.util.Arrays;

public class BubbleSort {

	public static int[] sort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length -i -1; j++) {
				if(arr[j] > arr[j+1]) {
					arr = swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}

	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 2, 3 };
		System.err.println(Arrays.toString(sort(arr)));
	}
}
