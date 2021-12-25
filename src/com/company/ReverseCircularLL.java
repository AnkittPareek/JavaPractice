package com.company;
import java.util.*;
import java.lang.*;
public class ReverseCircularLL {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int i) {
            data = i;
            next = null;
        }
    }

    static ReverseCircularLL insert(ReverseCircularLL list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null)
            list.head = new_node;
        else {
            Node last = list.head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = new_node;
        }
        new_node.next=head;
        return list;
    }
    static Node reverseCircular(Node headRef) {
        //write your code here
        if(headRef==null || headRef.next == headRef)
            return headRef;
        else {
            Node newHead = headRef.next,temp = headRef.next.next;
            while (temp != head) {
                newHead.next = headRef;
                headRef=newHead;
                newHead=temp;
                temp=temp.next;
                newHead.next=headRef;
            }
            head.next=newHead;
            return newHead;
        }
    }
    static void printCircular(Node head) {
        //write your code here
        if(head==null)
            return;
        Node pointer = head;
        do{
            System.out.print(pointer.data+" ");
            pointer=pointer.next;
        }while (pointer!=head);
    }
    public static void main(String[] args) {
        ReverseCircularLL list = new ReverseCircularLL();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            list = insert(list,sc.nextInt());
        head = reverseCircular(head);
        printCircular(head);
    }
}