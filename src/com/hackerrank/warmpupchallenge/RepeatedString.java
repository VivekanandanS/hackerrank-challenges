package com.hackerrank.warmpupchallenge;

public class RepeatedString {

	static long repeatedString(String s, long n) {
		int COUNT = 0;
		int SUB_COUNT = 0;
		int SUB_STRING_LENGTH = (int) (n % s.length());
		 
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				COUNT++;
				if (i < SUB_STRING_LENGTH)
					SUB_COUNT++;
			}

		}
		return (COUNT * (n/s.length())) + SUB_COUNT;
	}

	public static void main(String[] args) {
		System.out.println(repeatedString("abca", 10));
	}

}
