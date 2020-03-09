package com.hackerrank.linkedlist;

public class ElementsofLinkedList {

    static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode node = head;
        while (null != node){
            System.out.println(node.data);
            node = node.next;
        }

    }
}
