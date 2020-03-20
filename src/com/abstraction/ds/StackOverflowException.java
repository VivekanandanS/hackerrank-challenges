package com.abstraction.ds;

public class StackOverflowException extends StackException {
	
	public static final String message = "Stack is full , push cannot be performed";
	
	public StackOverflowException() {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
