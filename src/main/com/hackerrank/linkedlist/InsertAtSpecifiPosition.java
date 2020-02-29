package main.com.hackerrank.linkedlist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InsertAtSpecifiPosition {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	// Complete the insertNodeAtPosition function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

		int index = 0;
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		SinglyLinkedListNode node = head;
		SinglyLinkedListNode prev = null;

		if (position == 0) {
			newnode.next = head;
			head = newnode;
			return head;
		}
		System.out.println(index);
		while (index != position) {
			System.out.println(index);
			prev = node;
			node = node.next;
			index++;
		}

		prev.next = newnode;
		if (null != node)
			newnode.next = node;
		return head;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		SinglyLinkedList llist = new SinglyLinkedList();
		for (int i = 0; i < 10; i++) {
			int llistItem = i;
			llist.insertNode(llistItem);
		}
		int data = 1;
		int position = 3;
		SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
		printSinglyLinkedList(llist_head, " ", bufferedWriter);
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
	}
}
