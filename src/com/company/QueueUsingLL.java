package com.company;
import java.util.*;

public class QueueUsingLL {
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
        //write your code here
        Node front=null;
        Node rear=null;
        private void enQueue(int data){
            Node newNode = new Node(data);
            if ( rear == null ) {
                rear = newNode;
                front = newNode;
                return;
            }

            rear.next = newNode;
            rear = rear.next;
        }
        private int deQueue(){
            if (front==null)
                return -1;
            if (rear==front) {
                int data = front.data;
                front=null;
                rear=null;
                return data;
            }
                int temp = front.data;
                front = front.next;
                return temp;
        }
    }
    public static void main(String[] args){
        Queue Q = new Queue();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            Q.enQueue(in .nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Q.deQueue());
        }
    }
}