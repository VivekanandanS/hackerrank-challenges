package com.hackerrank.warmpupchallenge;

public class JumpingClouds {

	static int jumpingOnClouds(int[] clouds) {
		int JUMPS = 0;
		for (int i = 0; i < clouds.length -1 ;i++) {
			JUMPS = JUMPS+ 1;
			if ((clouds.length > (i + 2)) && (clouds[i + 2]) != 1)
				i = i + 1 ;
			
		}
		return JUMPS;
	}

	public static void main(String[] args) {
		//int[] clouds = {0 ,0 ,1 ,0 ,0 ,1 ,0 };
		int[] clouds = {0, 0, 0, 1 ,0 ,0};
		System.out.println("JUMPS");
		System.out.println(jumpingOnClouds(clouds));
	}
}
