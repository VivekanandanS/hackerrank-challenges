package com.hackerrank.dictionariesandhashmaps;

public class SherlockandAnagrams {
	static int sherlockAndAnagrams(String s) {
		int ANAGRAMS = 0;
		int LEN = 0;
		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j < s.length() - LEN - 1; j++) {
				System.out.println(i + " " + j);
//				System.out.println(s.substring(i, j));
			}
		}

		return ANAGRAMS;

	}

	public static void main(String[] args) {
		String anagram = "cdcd";
//		anagram = "ifailuhkqq";
//		anagram = "kkkk";
		System.out.println(sherlockAndAnagrams(anagram));
	}
}
