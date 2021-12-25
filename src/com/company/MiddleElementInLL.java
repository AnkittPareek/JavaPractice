package com.company;
import java.util.*;

public class MiddleElementInLL {
    //Node with data variable and next
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    //initialising head node 'head' to null
    public static Node head = null;

    public static Node last;

    //method to add the node at the end of the linked list
    public void add(int value) {
        // Assume head is the head of the linked list
        Node newNode = new Node(value);
        //if the linked list is empty then
        if (head == null) {
            head = new Node(value);
            return;
        }

        last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }
    //Method to print the middle element of the linked list
    public static void printMiddleElement(Node head) {
        //write your code here
        if(head.next==null){
            System.out.println(head.data);
            return;
        }
        Node slowptr = head;
        Node fastptr = head;
        while(fastptr.next!=null){
            if (fastptr.next.next==null)
                break;
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        if (fastptr.next==null)
            System.out.println(slowptr.data);
        else
            System.out.println(slowptr.next.data);
    }
    public static void main(String[] arg) {
        MiddleElementInLL obj = new MiddleElementInLL();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            obj.add(in.nextInt());
        }
        printMiddleElement(obj.head);
    }
}