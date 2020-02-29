package main.com.skillzena.challenges;

import java.util.Arrays;

public class AdjacentDistributionProblem {

	public static int[] findValues(int[] childrens) {
		int[] tshirts = new int[childrens.length];
		tshirts[0] = 1;
		for (int i = 1; i < tshirts.length; i++) {
			tshirts[i] = 1;
			if (childrens[i] > childrens[i - 1])
				tshirts[i] = 2;
		}

		for (int i = tshirts.length - 1; i > 0; i--) {

			
			if ((childrens[i - 1] > childrens[i])) {
				
				System.out.println(childrens[i - 1]+" "+childrens[i]);
				if ((((i - 2) > 0)) && (childrens[i - 2] == childrens[i]))
					continue;
				else if (tshirts[i - 1] <= tshirts[i]) {
					tshirts[i - 1] = tshirts[i] + 1;
				} else {
					tshirts[i - 1] = tshirts[i - 1] + 1;
					
					System.out.println("("+childrens[i -2 ]+")"+childrens[i - 1]+" "+childrens[i]+"="+tshirts[i - 1]);
				}
			
			}
		}

		return tshirts;
	}

	public static void main(String[] args) {
		int[] childrens = new int[] { 5, 4, 3, 0, 1, 3, 2, 2, 3, 1, 5, 2, 5, 5, 5, 5, 3, 1, 1, 1, 0, 4, 5, 0, 5, 2, 3,
				4, 2 };
		System.out.println(Arrays.toString(findValues(childrens)));
//		4 3 2 1 2 3 1 1 2 1 2 1 2 1 1 3 2 1 1 2 1 2 3 1 2 1 2 3 1

	}
}
