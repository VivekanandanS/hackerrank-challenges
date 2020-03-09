package com.hackerrank.linkedlist;

public class ReverseList {

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode current = head;

        while (next != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

}


