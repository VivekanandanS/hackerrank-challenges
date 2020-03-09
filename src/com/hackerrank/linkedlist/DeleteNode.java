package com.hackerrank.linkedlist;

public class DeleteNode {


    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        if (position == 0)
            return head.next;

        int i = 0;
        SinglyLinkedListNode node = head;
        SinglyLinkedListNode previous = null;


        while (position != i) {
            previous = node;
            node = node.next;
            i++;
        }

        previous.next = node.next;
        return head;
    }

}
