package com.hackerrank.arrays;

public class ArrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {

		long MAX = 0;
		int start = 1;
		int end = n;

		for (int i = 0; i < queries.length; i++) {

			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];

			if (b >= start && a <= end) {
				System.out.println("con1");
				MAX += k;
				if (a >= start)
					start = a;
				if (b <= end)
					end = b;
			} else if (MAX == k) {
				System.out.println("con2");
				if (a < start)
					start = a;
				if (b > end)
					end = b;
			} else if (k > MAX) {
				System.out.println("con3");
				start = a;
				end = b;
				MAX = k;
			}

		}
		return MAX;

	}

	public static void main(String[] args) {
		int n = 0;
		int[][] queries = null;
		// S1
		/*
		 * n = 5; queries = new int[][] { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } };
		 */

		// S2
		/*
		 * n = 10; queries = new int[][] { { 2, 6, 8 }, { 3 ,5 ,7 }, { 1, 8, 1 },{5 ,9
		 * ,15} };
		 */

		// S3
		/*
		 * n=10; queries = new int[][] { { 1, 5, 3 }, {4 ,8 ,7 }, { 6 ,9, 1 } };
		 */

		// T2
		n = 40;
		queries = new int[][] { { 29, 40, 787 }, { 9, 26, 219 }, { 21, 31, 214 }, { 8, 22, 719 }, { 15, 23, 102 },
				{ 11, 24, 83 }, { 14, 22, 321 }, { 5, 22, 300 }, { 11, 30, 832 }, { 5, 25, 29 }, { 16, 24, 577 },
				{ 3, 10, 905 }, { 15, 22, 335 }, { 29, 35, 254 }, { 9, 20, 20 }, { 33, 34, 351 }, { 30, 38, 564 },
				{ 11, 31, 969 }, { 3, 32, 11 }, { 29, 35, 267 }, { 4, 24, 531 }, { 1, 38, 892 }, { 12, 18, 825 },
				{ 25, 32, 99 }, { 3, 39, 107 }, { 12, 37, 131 }, { 3, 26, 640 }, { 8, 39, 483 }, { 8, 11, 194 },
				{ 12, 37, 502 } };

		System.out.println(arrayManipulation(n, queries));
	}
}
