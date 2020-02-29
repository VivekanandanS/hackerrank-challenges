package main.com.hackerrank.sorting;

import java.util.Arrays;

public class MarkandToys {

	static int maximumToys(int[] prices, int k) {
		int TOYS = 0;
		int PRICES = 0;
		Arrays.parallelSort(prices);
		System.out.println(Arrays.toString(prices));
		for (int i = 0; i < prices.length; i++) {
			if ((PRICES + prices[i]) >= k)
				break;
			PRICES += prices[i];
			TOYS++;
		}
		return TOYS;
	}

	public static void main(String[] args) {
		int k = 50;
		int[] toys = new int[] { 1, 12, 5, 111, 200, 1000, 10 };
		System.out.println(maximumToys(toys, k));
	}

}
