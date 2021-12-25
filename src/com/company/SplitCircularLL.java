package com.company;
import java.util.*;
class SplitCircularLL {
    static Node head;
    static Node h1,h2;

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }
    void divide() {
        if(head==null)
            return;
        if(head.next==head){
            h1=head;
            h1.next=h1.next;
            return;
        }
        if(head.next.next==head){
            h1=head;
            h2=head.next;
            h1.next=h1;
            h2.next=h2;
            return;
        }
        //write your code here
        Node slowptr = head, fastptr = head;
        while(fastptr.next!=head ){
            if(fastptr.next.next!=head) {
                slowptr = slowptr.next;
                fastptr = fastptr.next.next;
            }
            else
                break;
        }
        h1=head;
        h2=slowptr.next;
        slowptr.next=h1;
        if(fastptr.next==head)
            fastptr.next=h2;
        else if(fastptr.next.next==head)
            fastptr.next.next=h2;
    }
    //Method to add nodes at the end of the list
    public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            new_node.next=head;
        } else {
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
        }
    }


    //Method to print data value of nodes of the linked list
    void print(Node temp) {
        Node node = temp;
        if (temp != null) {
            do {
                System.out.print(node.data + " ");
                node = node.next;
            } while (node != temp);
        }
    }

    public static void main(String[] args) {
        SplitCircularLL list = new SplitCircularLL();
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0; i<n; i++) {
            list.push(in.nextInt());
        }
        list.divide();
        System.out.println("");
        list.print(h1);
        System.out.println("");
        list.print(h2);
    }
}