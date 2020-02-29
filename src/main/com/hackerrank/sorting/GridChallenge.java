package main.com.hackerrank.sorting;

public class GridChallenge {

	static String gridChallenge(String[] grid) {
		String RESULT = "YES";

		for (int i = 0; i < grid.length; i++) {
			char[] str = grid[i].toCharArray();
			for (int j = 0; j < str.length; j++) {
				for (int k = 0; k < str.length - 1; k++) {
					if (str[k] > str[j]) {
						char temp = str[j];
						str[j] = str[k];
						str[k] = temp;
					}
				}
			}
			grid[i] = new String(str);
			System.out.println(grid[i]);
		}

		for (int i = 0; i < grid[0].length(); i++) {
			for (int j = 0; j < grid.length -1; j++) {
				if (grid[j].charAt(i) > grid[j + 1].charAt(i)) {
					RESULT = "NO";
				}
			}
		}

		return RESULT;

	}

	public static void main(String[] args) {
		String[] grid = new String[] { "abcde", "fghij", "klmno", "pqrst", "uvwxy" };
//		grid = new String[] { "abc", "lmp", "qrt" };
//		grid = new String[] { "mpxz", "abcd", "wlmf" };
//		grid = new String[] { "abc", "hjk", "mpq", "rtv" };
		System.out.println(gridChallenge(grid));
	}
}
