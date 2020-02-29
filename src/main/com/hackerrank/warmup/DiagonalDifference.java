package main.com.hackerrank.warmup;

import java.util.List;

public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
		int LSUM = 0;
		int RSUM = 0;
		int start = 0;
		int end = arr.size() - 1;
		for (int i = 0; i < arr.size(); i++) {
			List<Integer> innerList = arr.get(i);
			RSUM += innerList.get(start + i);
			LSUM += innerList.get(end - i);
		}
		return Math.abs(LSUM - RSUM);

	}
}
