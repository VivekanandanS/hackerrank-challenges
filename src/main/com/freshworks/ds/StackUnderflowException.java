package main.com.freshworks.ds;

public class StackUnderflowException extends StackException {
	public static final String message = "Stack is empty , pop cannot be performed";

	public StackUnderflowException() {
		super(message);
	}
}
