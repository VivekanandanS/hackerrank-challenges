package com.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class ComparetheTriplets {

	public static int ASCORE = 0;
	public static int BSCORE = 0;

	public static void comapare(int a,int b) {
		if(a>b)
			ASCORE++;
		else if(a<b)
			BSCORE++;
			
	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		comapare(a.get(0), b.get(0));
		comapare(a.get(1), b.get(1));
		comapare(a.get(2), b.get(2));		
		
		List<Integer>  SCORE = new ArrayList<Integer>();
		SCORE.add(ASCORE);
		SCORE.add(BSCORE);
		return SCORE;
	}

}
