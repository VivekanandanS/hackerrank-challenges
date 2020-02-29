package main.com.hackerrank.warmpupchallenge;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		int VALLEYS = 0;
		int SEA_LEVEL = 0;
		boolean VALLEY = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U')
				SEA_LEVEL++;
			else
				SEA_LEVEL--;
//			System.err.println(SEA_LEVEL);
			if (SEA_LEVEL >= 0)
				VALLEY = false;
			if (SEA_LEVEL < 0 && VALLEY == false) {
				VALLEY = true;
				VALLEYS++;
			}

		}

		return VALLEYS;
	}

	public static void main(String[] args) {
//		System.out.println(countingValleys(8, "UDDDUDUU"));
		System.out.println(countingValleys(8, "DDUUDDUDUUUD"));
	}

}
