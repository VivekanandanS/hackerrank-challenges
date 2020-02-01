package com.preparation.search;

public class Binarysearch {

	public static int binarySearch(int arr[], int low, int high, int x) {

		int mid = (high + low) / 2;
		if (arr[mid] == 3)
			return mid;
		if (x < arr[mid])
			return binarySearch(arr, low, mid - 1, x);
		return binarySearch(arr, mid + 1, high, x);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(binarySearch(arr, 0, arr.length - 1, 3));
	}

}
