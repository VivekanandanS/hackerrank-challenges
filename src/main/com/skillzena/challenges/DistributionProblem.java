package main.com.skillzena.challenges;

import java.util.Arrays;

public class DistributionProblem {

	public static int[] findValues(int[] childrens) {
		int[] tshirts = new int[childrens.length];
		for(int i=0; i< childrens.length;i++) {
			tshirts[i] = 1;
		}
		for(int i=0; i< childrens.length;i++) {
			if(i-1 >= 0 && tshirts[i-1] <= tshirts[i] && childrens[i-1] > childrens[i]) {
				tshirts[i-1] = tshirts[i] + 1; 
				check(i-1, tshirts,childrens);
			}
			if(i+1 < childrens.length && tshirts[i+1] <= tshirts[i] && childrens[i+1] > childrens[i]) {
				tshirts[i+1] = tshirts[i] +1;
				check(i+1, tshirts,childrens);
			}
		}
		return tshirts;
	}

	private static void check(int i, int[] tshirts, int[] childrens) {
		if(i-1 >= 0 && tshirts[i-1] <= tshirts[i] && childrens[i-1] > childrens[i]) {
			tshirts[i-1] = tshirts[i] + 1; 
			check(i-1, tshirts,childrens);
		}
		if(i+1 < childrens.length && tshirts[i+1] <= tshirts[i] && childrens[i+1] > childrens[i]) {
			tshirts[i+1] = tshirts[i] +1;
			check(i+1, tshirts,childrens);
		}
	}

	public static void main(String[] args) {
		int[] childrens = new int[] { 5, 4, 3, 0, 1, 3, 2, 2, 3, 1, 5, 2, 5, 5, 5, 5, 3, 1, 1, 1, 0, 4, 5, 0, 5, 2, 3,
				4, 2 };
		System.out.println(Arrays.toString(findValues(childrens)));
//		4 3 2 1 2 3 1 1 2 1 2 1 2 1 1 3 2 1 1 2 1 2 3 1 2 1 2 3 1
		
	}
}
