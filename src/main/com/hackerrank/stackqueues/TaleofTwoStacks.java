package main.com.hackerrank.stackqueues;

import java.util.Scanner;
import java.util.Stack;

public class TaleofTwoStacks {

     class MyQueue<Type>{
        Stack<Type> stack1,stack2;

        public MyQueue(){
            stack1= new Stack<Type>();
            stack2= new Stack<Type>();
        }
        public void enqueue(Type value){
            stack1.push(value);
        }

        public Type dequeue(){
            if(stack1.size()==0)
                return null;
            while(stack1.size() == 0){
                stack2.push(stack1.pop());
            }
            Type value = stack2.pop();

            while(stack2.size() == 0){
                stack1.push(stack2.pop());
            }
            return value;
        }

        public Type peek(){
            if(stack1.size()==0)
                return null;
            return stack1.lastElement();
        }

    }
    public static void main(String[] args) {
    	TaleofTwoStacks tale = new TaleofTwoStacks();
        MyQueue<Integer> queue = tale.new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

