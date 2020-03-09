package com.hackerrank.linkedlist;

public class InsetatHeadofLinkedList {

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = head;
        return newNode;

    };
}
