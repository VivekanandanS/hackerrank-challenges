package com.freshworks.ds;

import java.util.Arrays;

public class Stack<Type> {

	private Object[] stack;
	private int top = -1;

	public Stack(int size) {
		this.stack = new Object[size];
	}

	public void push(Type value) throws StackOverflowException {
		if (top + 1 > stack.length)
			throw new StackOverflowException();
		stack[++top] = value;
	}

	@SuppressWarnings("unchecked")
	public Type pop() throws StackUnderflowException {
		if (top < 0)
			throw new StackUnderflowException();
		Type value = (Type) stack[top];
		top--;
		return value;
	}

	public int getTop() {
		return this.top + 1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(this.stack);
	}

}
