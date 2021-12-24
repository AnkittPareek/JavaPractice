package com.company;
import java.util.*;

public class DeleteLastNodeOfLL {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        deleteLastNode();
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    // Method to delete the last node of the LinkedList
    static void deleteLastNode() {
        Node temp ;
        if(head==null)
            return;
        else if(head.next==null){
            head=null;
        }
        else {
            temp=head;
            while (temp.next.next!=null)
                temp=temp.next;
            temp.next=null;
        }
    }
}