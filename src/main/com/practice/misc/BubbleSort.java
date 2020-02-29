package main.com.practice.misc;

public class BubbleSort {

	public static void sort(int[] arr) {
		int SWAPS = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					SWAPS++;
				}

			}
		}

		System.out.println("Array is sorted in " + SWAPS + " swaps.");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[arr.length - 1]);
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 1, 4, 2, 8 };
//		System.out.println(Arrays.toString(sort(arr)));

	}
}
