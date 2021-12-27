package com.company;
import java.util.*;

class CreateDoublyCircularLL {
    Node head;
    // Creating structure for nodes
    class Node {
        //write your code here
        int data;
        CreateDoublyCircularLL.Node next;
        CreateDoublyCircularLL.Node prev;

        Node(int n) {
            data = n;
            next = null;
            prev = null;
        }
    }

    // This method will push the input data at the end of the list
    void push(int data) {
        //write your code here
        CreateDoublyCircularLL.Node new_node = new CreateDoublyCircularLL.Node(data);
        if (head==null) {
            head = new_node;
            new_node.next = new_node;
            new_node.prev = new_node;
        }
        else {
            Node p = head;
            while(p.next!=head)
                p=p.next;
            p.next=new_node;
            new_node.prev = p;
            new_node.next=head;
            head.prev=new_node;
        }
    }

    void print() {
        //write your code here
        Node p = head;
        Node q = head;
        if (head==null)
            return;
        else {
            System.out.print(p.data+" ");
            while (p.next!=head) {
                p=p.next;
                System.out.print(p.data+" ");
            }
            System.out.println();
            while (q.prev!=head) {
                q=q.prev;
                System.out.print(q.data+" ");
            }
            q=q.prev;
            System.out.print(q.data+" ");

        }
    }
    public static void main(String[] args) {
        CreateDoublyCircularLL obj = new CreateDoublyCircularLL();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            obj.push(in.nextInt());
        }
        obj.print();
    }
}