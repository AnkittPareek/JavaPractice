package com.company;
import java.io.PrintStream;
import java.util.*;
public class StackUsingSingleQueue {
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
    public static class Queue {
        Node head;
        Node tail;
        private int currentSize; // number of items
        public Queue() {
            super();
            head = null;
            tail = null;
            currentSize = 0;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void enQueue(int data) {
            Node node = new Node(data);
            if (tail == null) {
                tail = node;
                head = node;
            } else {
                tail.setNext(node);
                tail = tail.getNext();
            }
            currentSize++;
        }
        public int deQueue() {
            int data = head.getData();
            head = head.getNext();
            if (head == null) { // it means it has got empty
                tail = null;
            }
            currentSize--;
            return data;
        }
        public int peek(){
            return head.data;
        }

        public int size(){
            return currentSize;
        }
    }

    Queue q = new Queue();
    /* Push operation of stack using queue*/
    void push(int x) {
        //write your code here
        q.enQueue(x);
    }

    /*Removes the top element of the stack*/
    int pop() {
        //write your code here
        if(q.isEmpty()) {
            System.exit(0);
        }
        if(q.size()==1) {
            int x = q.head.data;
            q.head = null;
            return x;

        }
        if(q.size()==2) {
            int x =  q.tail.data;
            q.tail = q.head;
            return x;
        }
        Node ref ;
        ref = q.head;
        while (ref.next.next!=null)
            ref = ref.next;
        int x = ref.next.data;
        ref.next=null;
        return x;
    }

    /*Returns the element at the top of the stack */
    int top() {
        //write your code here
        if(q.isEmpty()) {
            System.out.println("empty");
            System.exit(0);
        }
        Node ref ;
        ref = q.head;
        if(q.size()==1)
            return q.head.data;
        if(q.size()==2) {
            return q.tail.data;
        }
        while (ref.next.next!=null)
            ref = ref.next;
        int x = ref.next.data;
        return x;
    }
    public static void main(String[] args) {
        StackUsingSingleQueue obj = new StackUsingSingleQueue();
        Scanner in = new Scanner(System.in);
        /*Enter the number of elements you want to add in the stack */
        int n = in .nextInt();
        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push( in .nextInt());
        }
        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());
    }
}