package main.com.hackerrank.string;

import java.util.Arrays;

public class ValidString {

	static String isValid(String s) {

		char[] charArr = s.toCharArray();
		int[] letters = new int[26];
		for (int i = 0; i < charArr.length; i++) {
			letters[charArr[i] - 'a']++;
		}

		boolean changed = false;
		int count = 0;

		System.out.println(Arrays.toString(letters));
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == 0)
				continue;
			if (count != letters[i] && count == 0) {
				count = letters[i];
				continue;
			}

			if (count != letters[i]) {
				if (changed || Math.abs(count - letters[i]) > 1 || (count > (letters[i] - 1)))
					return "NO";
				count = count > letters[i] ? letters[i] : count;
				changed = true;
			}

		}

		return "YES";
	}

	public static void main(String[] args) {
		// YES
		System.out.println(isValid("abbac"));
	}
}
