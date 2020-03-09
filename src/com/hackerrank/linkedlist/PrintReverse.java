package com.hackerrank.linkedlist;

import java.util.Stack;

public class PrintReverse {


    static void reversePrint(SinglyLinkedListNode head) {

        Stack<Integer> stack = new Stack<Integer>();

        while (null != head){
            stack.push((int)head.data);
            head = head.next;
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }

}
