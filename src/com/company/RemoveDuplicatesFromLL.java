package com.company;
import java.util.*;

// Java program to remove duplicates from a sorted linked list
class RemoveDuplicatesFromLL {
    Node head;

    //class to create nodes.
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void noRepeat() {
        //Write your code here
        if(head==null)
            return;
        Node temp = head;
        Node temp2 = head.next;
        while(temp!=null){
            temp2=temp.next;
            while(temp2!=null) {
                if(temp.data== temp2.data){
                    temp.next=temp2.next;
                }
                temp2=temp2.next;
            }
            temp=temp.next;
        }
    }

    // Below methods would help you create a singly linked list.
    // inserts a new node at the end of the list.
    public void insert(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    // Method that will print the linked list.
    void print_list() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        RemoveDuplicatesFromLL obj = new RemoveDuplicatesFromLL();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            obj.insert(in.nextInt());
        }
        obj.noRepeat();
        obj.print_list();
    }
}