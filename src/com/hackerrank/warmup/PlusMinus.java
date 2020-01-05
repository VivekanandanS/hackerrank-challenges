package com.hackerrank.warmup;

public class PlusMinus {

	static void plusMinus(int[] arr) {

		float POSITIVE, NEGATIVE, ZEROS;
		POSITIVE = NEGATIVE = ZEROS = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				POSITIVE++;
			else if (arr[i] < 0)
				NEGATIVE++;
			else
				ZEROS++;
		}
		System.out.printf("%.6f", (POSITIVE / arr.length));
		System.out.println();
		System.out.printf("%.6f", (NEGATIVE / arr.length));
		System.out.println();
		System.out.printf("%.6f", (ZEROS / arr.length));

	}

	public static void main(String[] args) {
		int[] arr = new int[] { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);
	}
}
