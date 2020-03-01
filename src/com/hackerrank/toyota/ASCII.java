package com.hackerrank.toyota;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ASCII {

	public static String transform(String sentence) {
		char[] array= sentence.toCharArray();
		
		for (int i = 0,j=0; i < array.length; i++) {
			
			if(j%2==0) {
				array[i] =Character.toUpperCase(array[i]);
				
			}
			
			if(array[i]!=' ')
				j++;
			
			
			
		}
		
		return String.valueOf(array);
				
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(transform(line));
		}

	}
}
