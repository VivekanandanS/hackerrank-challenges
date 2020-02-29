package main.com.hackerrank.linkedlist;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Finding merge point in Linkedlist ,
 * 1. Add a attribute to Node Structure say `visit` flag , mark it true once visited
 * Now loop through second List , if node found to be already visited then node is merge node
 * <p>
 * Complexity would be M + N where M and N are size of list
 * <p>
 * 2. Find difference between two list and starting from difference point would help to find the
 * merger node
 * <p>
 * M+N+d
 */
public class MergePointInLinkedList {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static int findSize(SinglyLinkedListNode node) {
        int height = 0;
        while (null != node) {
            height++;
            node = node.next;
        }
        return height;
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int d1 = findSize(head1);
        int d2 = findSize(head2);
        int i = 0;
        int d = Math.abs(d1 - d2);
        while (d1 > d2 && i < d) {
            head1 = head1.next;
            i++;
        }
        while (d2 > d1 && i < d) {
            head2 = head2.next;
            i++;
        }

        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;

        }


        return head1.data;
    }


}
