package main.com.practice.misc;

public class MaximumSumContigousArray {

	public static int sum(int[] array) {
		int max_so_for = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for (int i = 0; i < array.length; i++) {
			max_ending_here = Math.max(array[i], max_ending_here + array[i]);

			if (max_so_for < max_ending_here)
				max_so_for = max_ending_here;
		}

		return max_so_for;
	}

	public static void main(String[] args) {
		int array[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
		System.out.println(sum(array));
	}
}
