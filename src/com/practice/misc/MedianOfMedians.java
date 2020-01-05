package com.practice.misc;

public class MedianOfMedians {

	public static int kthSmallest(int[] arr, int left, int right, int pos) {

		if (pos > 0 && pos <= right - left + 1) {
			int i = right - left + 1;
			
		}

		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 3, 5, 7, 4, 19, 26 };
		System.out.println(kthSmallest(arr, 0, arr.length - 1, 2));
	}

}
