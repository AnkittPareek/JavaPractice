package com.company;
import java.util.*;

public class DeleteNodeAtGivenIndexLL {
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
        int index = s.nextInt();
        deleteNodeAtGivenIndex(index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    // Method to delete the node at the given index of the LinkedList
    static void deleteNodeAtGivenIndex(int index) {
        // Write your code here
        if(head==null)
            return;
        else if(head.next==null && index==0)
            head=null;
        else {
            if(index==0)
                head=head.next;
            Node temp=head;
            int counter = 1;
            while(counter!=index){
                if (temp.next==null)
                    return;
                temp=temp.next;
                counter++;
            }
            temp.next=temp.next.next;
        }
    }

}