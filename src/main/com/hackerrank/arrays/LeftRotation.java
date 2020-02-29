package main.com.hackerrank.arrays;

import java.util.Arrays;

public class LeftRotation {
	static int[] rotLeft(int[] array, int rotations) {
		rotations = rotations % array.length;
		if (rotations == array.length)
			return array;
		int[] result = new int[array.length];
		int i = 0;
		for (i = 0; i < array.length; i++) {
			result[(i + array.length - rotations ) % array.length] = array[i];

		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(rotLeft(array, 3)));
	}
}
