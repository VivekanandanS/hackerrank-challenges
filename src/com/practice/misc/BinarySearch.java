package com.practice.misc;

public class BinarySearch {

	public static int search(int[] arr, int n, int start, int end) {
		int mid = (end - start) / 2;
		System.out.println( start + " "+ end +" "+ mid+" "+ arr[mid] + " "  + n);
		if (arr[mid] == n)
			return mid;
//		if (n > arr[mid])
//			return search(arr, n, mid + 1, end);
//		if (n < arr[mid])
//			search(arr, n, start, mid - 1);
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 13, 14, 26, 29, 33, 41, 46 };
		System.out.println(search(arr, 41, 0, arr.length));
	}

}
