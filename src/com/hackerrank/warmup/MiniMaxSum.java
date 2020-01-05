package com.hackerrank.warmup;

public class MiniMaxSum {

	static void miniMaxSum(long[] arr) {
		long MIN = 0;
		long MAX = 0;
		for (int i = 0; i < arr.length; i++) {
			long SUM = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				SUM += arr[j];

			}
			System.out.println(SUM + " " + MIN + " " + MAX);
			if (SUM > MAX)
				MAX = SUM;
			if (SUM < MIN || MIN == 0)
				MIN = SUM;
		}
		System.out.println(MIN + " " + MAX);

	}

	public static void main(String[] args) {

		long[] arr = new long[] { 123, 2, 3, 4, 5 };
		arr = new long[] { 256741038, 623958417, 467905213, 714532089, 938071625 };
		miniMaxSum(arr);
	}
}
