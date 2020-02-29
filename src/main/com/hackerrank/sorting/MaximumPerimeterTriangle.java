package main.com.hackerrank.sorting;

import java.util.Arrays;

public class MaximumPerimeterTriangle {

	static int[] maximumPerimeterTriangle(int[] sticks) {
		int[] SIDES = new int[3];
		SIDES[0] = -1;
		Arrays.sort(sticks);

		for (int i = sticks.length - 1; i > 1; i--) {
			if (((sticks[i] + sticks[i - 1]) > sticks[i - 2]) && ((sticks[i - 2] + sticks[i - 1]) > sticks[i])
					&& ((sticks[i] + sticks[i - 2]) > sticks[i - 1])) {
				System.out.println(sticks[i] + " " + sticks[i - 1] + " " + sticks[i - 2]);
				SIDES[0] = sticks[i - 2];
				SIDES[1] = sticks[i - 1];
				SIDES[2] = sticks[i];
				return SIDES;
			}
		}
		return SIDES;
	}
	


	public static void main(String[] args) {
		int[] STICKS = new int[] { 1, 1, 1, 2, 3, 5 };
		maximumPerimeterTriangle(STICKS);
	}
}
