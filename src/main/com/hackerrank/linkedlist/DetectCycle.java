package main.com.hackerrank.linkedlist;

public class DetectCycle {

	public boolean hasCycle(Node head) {

		Node tortoise = head;
		Node hare = head;

		while (null != hare && null != hare.next) {
			tortoise = tortoise.next;
			hare = hare.next.next;

			if (hare == tortoise)
				return true;
		}
		return false;
	}
}
