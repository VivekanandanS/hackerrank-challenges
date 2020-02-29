package main.com.hackerrank.string;

public class AlternatingString {
	static int alternatingCharacters(String s) {
		char current = s.charAt(0);
		int count=0;
		for (int i = 1; i < s.length(); i++) {
			if(current==s.charAt(i)) 
				count++;
			else 
				current= s.charAt(i);
			
		}
		
		return count;
    }
	
	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAAA"));
		System.out.println(alternatingCharacters("BBBBB"));
		System.out.println(alternatingCharacters("ABABABAB"));
		System.out.println(alternatingCharacters("BABABA"));
		System.out.println(alternatingCharacters("AAABBB"));
	}
}
