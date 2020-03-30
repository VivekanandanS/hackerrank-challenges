package com.hackerrank.stack;

import java.util.Scanner;

public class MaximumElement {

    public class HackerStack {
        private int top;
        private int maxIndex;
        private int[] stack;

        HackerStack() {
            top = -1;
            maxIndex = -1;
            stack = new int[(int) Math.pow(10, 5)];
        }


        public void push(int value) {
            stack[++top] = value;
            if (maxIndex < 0 || stack[maxIndex] < value)
                maxIndex = top;

        }

        public void pop() {
            top--;
            if (top < maxIndex)
                maxIndex = findMaxIndex();
        }

        public int max() {
            return stack[maxIndex];
        }

        int findMaxIndex() {
            int maxIndex = 0;
            for (int i = top; i > 0; i--) {
                if (stack[maxIndex] < stack[i])
                    maxIndex = i;
            }
            return maxIndex;
        }
    }

    public static int numberOfQueries;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberOfQueries = scanner.nextInt();
        int i = 0;
        MaximumElement maximumElement = new MaximumElement();
        HackerStack stack = maximumElement.new HackerStack();
        while (i < numberOfQueries) {

            switch (scanner.nextInt()) {
                case 1:
                    stack.push(scanner.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(stack.max());
                    break;
            }
            i++;
        }

    }

}
