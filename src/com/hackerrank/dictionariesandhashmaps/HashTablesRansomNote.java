package com.hackerrank.dictionariesandhashmaps;

import java.util.HashMap;

public class HashTablesRansomNote {
	static String checkMagazine(String[] magazine, String[] note) {
		String POSSIBLE = "Yes";
		HashMap<String, Integer> wordsMaps = new HashMap<String, Integer>();
		for (int i = 0; i < magazine.length; i++) {

			if (!wordsMaps.containsKey(magazine[i])) {
				wordsMaps.put(magazine[i], 1);
			} else {
				wordsMaps.put(magazine[i], wordsMaps.get(magazine[i]) + 1);
			}

		}

		for (int i = 0; i < note.length; i++) {

			if (!wordsMaps.containsKey(note[i]) || wordsMaps.get(note[i]) == 0) {
				POSSIBLE = "No";
				break;
			}

			wordsMaps.put(note[i], wordsMaps.get(note[i]) - 1);
		}
		System.out.println(POSSIBLE);
		return POSSIBLE;
	}

	public static void main(String[] args) {
		String[] magazine = null;
		String[] note = null;
		magazine = new String[] { "two", "times", "three", "is", "not", "four" };
		note = new String[] { "two", "times", "two", "is", "four" };
		
		magazine = new String[] {"ive" ,"got", "a" ,"lovely" ,"bunch" ,"of" ,"coconuts"};
		note = new String[] {"ive","got","some","coconuts"};
		System.out.println(checkMagazine(magazine, note));

	}
}
