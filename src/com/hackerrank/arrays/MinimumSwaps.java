package com.hackerrank.arrays;

public class MinimumSwaps {
	static int minimumSwaps(int[] arr) {
		int SWAPS = 0;
		for (int i = 0; i < arr.length; i++) {
			if((i+1)==arr[i])
				continue;
			int indexI = i;
			int indexJ = arr[i]-1;
			int temp = arr[indexI];
			arr[indexI]= arr[indexJ];
			arr[indexJ]=temp;
			i--;
			SWAPS++;
		}
		return SWAPS;
	}

	public static void main(String[] args) {
		// 00
		int[] array;
//		array = new int[] { 4, 3, 1, 2 };
//		array = new int[] { 2, 3, 4, 1, 5 };
		array = new int[] { 8, 3, 5, 2, 4, 6, 7, 1};
		System.out.println(minimumSwaps(array));

	}
}
