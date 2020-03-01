package com.hackerrank.arrays;

public class NewYearChaos {
	public static final int MAX_BRIBERS = 2;

	static void minimumBribes(int[] queue) {
		int BRIBES = 0;
		for (int i = 0; i < queue.length; i++) {
			if ((queue[i] - (i + 1)) > 2) {
				BRIBES = -1;
				break;
			}
			for (int j = Math.max(0, queue[i] - MAX_BRIBERS); j < i; j++) {
				if (queue[j] > queue[i])
					BRIBES++;
			}

		}
		System.out.println(BRIBES > 0 ? BRIBES : "Too chaotic");
	}

	public static void main(String[] args) {
		// Test Case 01
//		int[] queue = { 2, 1, 5, 3, 4 };
		// Test Case 02
//		int[] queue = { 2, 5, 1, 3, 4 };
		// Test Case 11
//		int[] queue = { 5, 1, 2, 3, 7, 8, 6, 4 };
		// Test Case 12
		int[] queue = { 1, 2, 5, 3, 7, 8, 6, 4 };
//		 Test Case 21
//		int[] queue = { 1, 2, 5, 3, 4, 7, 8, 6 };

		minimumBribes(queue);
	}
}
