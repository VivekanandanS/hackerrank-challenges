package main.com.hackerrank.sorting;

import java.util.Arrays;

public class GreedyFlorist {

	static double getMinimumCost(int k, int[] cost) {
		double COST = 0;
		Arrays.parallelSort(cost);
		int NUM_FLOWERS = cost.length / k;
		if (NUM_FLOWERS == 0)
			NUM_FLOWERS = 1;

		int i = 0;
		int j = cost.length - 1;

		return COST;
	}

	public static void main(String[] args) {
		int FRIENDS = 3;
		int[] FLOWERS = new int[] { 1, 3, 5, 7, 9 };
		System.out.println(getMinimumCost(FRIENDS, FLOWERS));
	}
}
