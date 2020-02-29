package main.com.hackerrank.arrays;

public class D2Array {

	static int hourglassSum(int[][] arr) {
		int SUM = -9 * 7;

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 1; j < arr[i].length - 1; j++) {
				int value = arr[i][j - 1] + arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 2][j - 1]
						+ arr[i + 2][j] + arr[i + 2][j + 1];
				if(value > SUM)
					SUM = value;
			}
		}

		return SUM;
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		System.out.println(hourglassSum(array));
	}

}
