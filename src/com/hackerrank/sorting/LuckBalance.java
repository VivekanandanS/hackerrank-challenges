package com.hackerrank.sorting;

public class LuckBalance {

	static int luckBalance(int k, int[][] contests) {
		int LUCK = 0;
		for (int i = 0; i < contests.length; i++) {
			for (int j = 0; j < contests.length; j++) {
				if (contests[i][0] > contests[j][0]) {
					int[] temp = contests[i];
					contests[i] = contests[j];
					contests[j] = temp;
				}
			}
		}

		for (int i = 0; i < contests.length; i++) {
			if (contests[i][1] == 0) {
				LUCK += contests[i][0];
				continue;
			}
			if (k == 0) {
				LUCK -= contests[i][0];
				continue;
			}
			LUCK += contests[i][0];
			k--;
		}

		return LUCK;
	}

	public static void main(String[] args) {
		int k = 3;
		int[][] contests = new int[][] { { 5, 1 }, { 2, 1 }, { 1, 1 }, { 8, 1 }, { 10, 0 }, { 5, 0 } };
		System.out.println(luckBalance(k, contests));
	}

}
