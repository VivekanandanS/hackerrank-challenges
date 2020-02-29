package main.com.practice.misc;

import java.util.Arrays;

public class MedianOfMedians {

	public static int findMedian(int[] arr, int left, int right) {

		int mid = (right + left) / 2;
		Arrays.sort(arr, left, right);
		return arr[mid];

	}

	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static int partition(int[] arr, int left, int right, int pivotValue) {

		int i;
		for (i = left; i < right; i++) {
			if (arr[i] == pivotValue)
				break;
		}
		swap(arr, i, right);
		i = left;
		for (int j = left; j < right; j++) {
			if (arr[j] < pivotValue) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, right);

		return i;
	}

	public static int kthSmallest(int[] arr, int left, int right, int pos) {

		if (pos > 0 && pos <= right - left + 1) {
			int numberOfElements = right - left + 1;

			int[] medians = new int[(numberOfElements + 4) / 5];
			int j;

			for (j = 0; j < numberOfElements / 5; j++) {
				int fromIndex = left + j * 5;
				medians[j] = findMedian(arr, fromIndex, fromIndex + 5);

			}

			if ((j * 5) < numberOfElements) {
				int fromIndex = left + j * 5;

				medians[j] = findMedian(arr, fromIndex, numberOfElements);
				j++;

			}

			int medianOfMedians = medians.length == 1 ? medians[0]
					: kthSmallest(medians, 0, medians.length - 1, medians.length / 2);
			int median = partition(arr, left, right, medianOfMedians);
			if (median - left == pos -1) 
	            return arr[pos]; 
	        if (median -left  > pos-1)  // If position is more, recur for left 
	            return kthSmallest(arr, left, median - 1, pos); 
	  
	        // Else recur for right subarray 
	        return kthSmallest(arr, median+1, right, pos -median + left -1); 

		}

		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 3, 5, 7, 4, 19, 26 };

		System.out.println(kthSmallest(arr, 0, arr.length - 1, 4));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
