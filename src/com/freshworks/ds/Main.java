package com.freshworks.ds;

public class Main {
	
	public static void main(String[] args)  throws Exception{
		
		/*
		Stack<Integer> intStack = new Stack<Integer>(5);
		for (int i = 0; i < 5; i++) {
			intStack.push(i);
		}
		
		System.out.println(intStack.getTop());
		*/
		
		
		List<Integer> linkedList = new List<Integer>();
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.printList();
		linkedList.reverseLinkedList();
		System.out.println();
		linkedList.printList();
		
		
		
	}
}
