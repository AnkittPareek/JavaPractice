package com.company;
import java.util.*;

public class StackUsingLL {
    public static class Node {
        private int data;
        private Node next;

        Node(int data) {
            super();
            this.data = data;
        }
        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
    public static class Stack {
        //write your code here
        Node top;

        public void push(int new_data){
            StackUsingLL.Node new_node = new StackUsingLL.Node(new_data);
            if (top == null) {
                top = new_node;
            } else {
                new_node.next = top;
                top = new_node;
            }
        }
        public int pop(){
            StackUsingLL.Node node = top;
            top = top.next;
            return node.data;
        }
        public int peek(){
            if (top==null){
                return -1;
            }
            StackUsingLL.Node node = top;
            return node.data;
        }
    }
    public static void main(String[] args){
        Stack s= new Stack();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            s.push( in .nextInt());
        }
        int topElement = s.peek();
        if (topElement != -1)
            System.out.println(topElement);
        for (int i = 0; i < n; i++) {
            System.out.println(s.pop());
        }
    }
}