package com.company;
import javax.print.attribute.standard.MediaSize;
import java.util.*;

public class QueueUsingSingleStack {
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
        Node head;
        private int currentSize; // number of items
        public Stack() {
            super();
            head = null;
            currentSize = 0;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void push(int data) {
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
            currentSize++;
        }
        public int pop() {
            if (head == null) {
                return Integer.MIN_VALUE;
            }
            int data = head.getData();
            head = head.getNext();
            currentSize--;
            return data;
        }
        public int peek()
        {
            if (!isEmpty()) {
                return head.data;
            }
            else {
                System.out.println(" ");
                return -1;
            }
        }
        public int size(){
            return currentSize;
        }
    }

    Stack stack = new Stack();
    //The basic push and pop method of a stack are used to create enqueue and dequeue function of a queue
    Node top = null;
    Node bottom = null;
    public void enQueue(int newData){
        //write your code here
        if(stack.size()==0) {
            stack.push(newData);
            top = stack.head;
            bottom = stack.head;
            return;
        }
        stack.push(newData);
    }

    //Function to deQueue an item from queue
    public void deQueue(){
        //write your code here
        if(stack.size()==0) {
            System.out.println("NA");
            return;
        }
        if(stack.size()==1){
            System.out.println(stack.head.data);
            stack.head = null;
            stack.currentSize = 0;
            return ;
        }
        int i = 2;
        bottom = stack.head;
        while (i<stack.size()){
            bottom=bottom.next;
            i++;
        }
        System.out.println( bottom.next.data );
        bottom.next=null;
        stack.currentSize=stack.size()-1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        QueueUsingSingleStack obj = new QueueUsingSingleStack();
        int n=in.nextInt();
        for(int i=0;i<n;i++) {
            obj.enQueue(in.nextInt());
        }
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
    }
}