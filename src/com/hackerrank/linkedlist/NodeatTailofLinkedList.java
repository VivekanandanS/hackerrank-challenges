package com.hackerrank.linkedlist;

public class NodeatTailofLinkedList {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode  newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode  node = head;

        if(null == node)
            return newNode;
        System.out.println(node.data);
        while (null != node.next){
            System.out.println(node.data);
            node = node.next;
        }

        node.next = newNode;
        return head;

    }
}
