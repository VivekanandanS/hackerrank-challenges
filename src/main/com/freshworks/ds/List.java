package main.com.freshworks.ds;

public class List<Type> {

	private Node head;

	public List() {

	}

	public void insert(Type data) {
		Node<Type> newNode = new Node<Type>(data);
		newNode.next = null;

		if (null == head)
			head = newNode;
		else {
			Node<Type> lastNode = head;
			while (null != lastNode.next) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
	}

	public void delete(Type key) {

		Node node = head;
		Node prev = null;
		if (key == head.data)
			head = head.next;
		else {

			while (node != null && node.data != key) {
				prev = node;
				node = node.next;
			}
			if (node != null)
				prev.next = node.next;
		}

	}

	public void printList() {
		Node<Type> node = head;
		while (null != node) {
			System.out.print(node + "\t");
			node = node.next;
		}
	}

	public void reverseLinkedList() {
		Node previous, current, next;
		previous = current = next = null;
		current = head;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}
		head = previous;

	}

}
