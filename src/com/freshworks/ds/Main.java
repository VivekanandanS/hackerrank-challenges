package com.freshworks.ds;

public class Main {
	
	public static void main(String[] args)  throws Exception{
		Stack<Integer> intStack = new Stack<Integer>(5);
		for (int i = 0; i < 5; i++) {
			intStack.push(i);
		}
		
		System.out.println(intStack.getTop());
		
	}
}
