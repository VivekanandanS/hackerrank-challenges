package com.hackerrank.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int SWAPS = 0;
        boolean SWAPPED = true;
        while (SWAPPED == true) {
            int Xi = -1;
            int Yi = -1;
            int MAX_DIFF = -100000;
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j]; k++) {
                    if ((arr[k] - arr[j]) > MAX_DIFF) {
                        MAX_DIFF = arr[k] - arr[j];
                        Xi = j;
                        Yi = k;
                    }
                }
            }

            if (Xi > -1 && Yi > -1 && (Xi != Yi)) {
                SWAPS++;
                int temp = arr[Xi];
                arr[Xi] = arr[Yi];
                arr[Yi] = temp;
            } else {
                SWAPPED = false;
            }

        }
        return SWAPS;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
