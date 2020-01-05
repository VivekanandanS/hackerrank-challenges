package com.hackerrank.warmup;

public class AVeryBigSum {

	static long aVeryBigSum(long[] ar) {
		long SUM = 0;
		
		for (int i = 0; i < ar.length; i++) {
			SUM+=ar[i];
		}
		
		return SUM;

    }
	
	
}
