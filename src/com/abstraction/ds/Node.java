package com.abstraction.ds;

public class Node<Type> {

	Type data;
	Node next;

	public Node(Type data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
}
