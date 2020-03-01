package com.hackerrank.string;

public class MakingAnagrams {

	static int makeAnagram(String a, String b) {

		char[] a_array = a.toCharArray();
		char[] b_array = b.toCharArray();
		int[] letters = new int[26];
		int count = 0;
		for (int i = 0; i < a_array.length; i++) {
			letters[a_array[i] - 'a'] = letters[a_array[i] - 'a'] + 1;
		}
		for (int i = 0; i < b_array.length; i++) {
			letters[b_array[i] - 'a'] = letters[b_array[i] - 'a'] - 1;
		}
		for (int i = 0; i < letters.length; i++) {
			count = count + Math.abs(letters[i]);
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(makeAnagram("cde", "abc"));
	}
}
