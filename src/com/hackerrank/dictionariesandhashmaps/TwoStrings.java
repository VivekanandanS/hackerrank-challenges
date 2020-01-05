package com.hackerrank.dictionariesandhashmaps;

import java.util.HashSet;

public class TwoStrings {

	static String twoStrings(String s1, String s2) {
        String POSSIBLE = "NO";
        char[] S1 = s1.toCharArray();
        char[] S2 = s2.toCharArray();
        HashSet<Character> strings = new HashSet<Character>();
        for (int i = 0; i < S1.length; i++) {
			strings.add(S1[i]);
		}
        
        for (int i = 0; i < S2.length; i++) {
        	if (strings.contains(S2[i])) {
                POSSIBLE = "YES";
                break;
            }
        }

        return POSSIBLE;
    }
	
	public static void main(String[] args) {
		System.out.println(twoStrings("hello", "world"));
	}
}
