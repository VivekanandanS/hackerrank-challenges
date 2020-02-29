package main.com.hackerrank.arrays;

public class ProductOfTwoNumbers {

	public static int maximumProduct(int[] arr) {
		int _1stMaximum = arr[0];
		int _2ndMaximum = Integer.MIN_VALUE;

		int _1stMinimum = arr[0];
		int _2ndMinimum = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > _1stMaximum) {
				_2ndMaximum = _1stMaximum;
				_1stMaximum = arr[i];
			} else if (arr[i] > _2ndMaximum)
				_2ndMaximum = arr[i];

			if (arr[i] < _1stMinimum) {
				_2ndMinimum = _1stMinimum;
				_1stMinimum = arr[i];
			} else if (arr[i] > _2ndMinimum) {
				_2ndMinimum = arr[i];
			}

		}

		if ((_1stMaximum * _2ndMaximum) > (_1stMinimum * _2ndMinimum))
			return _1stMaximum * _2ndMaximum;
		return _1stMinimum * _2ndMinimum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 12, 5, 4, 13, -12, -14 };
		System.out.println(12 * 13);
		System.out.println(maximumProduct(arr));
	}

}
