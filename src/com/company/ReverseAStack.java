package com.company;
import java.util.*;

public class ReverseAStack {
    class Node {
        char data;
        Node next;
        public Node(char new_data) {
            data = new_data;
            next = null;
        }
    }

    Node top;

    // Push and pop operations
    public void push(char new_data) {

        Node new_node = new Node(new_data);
        if (top == null) {

            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;


        }
    }

    public Node pop() {
        Node node = top;
        top = top.next;
        return node;
    }

    // prints contents of stack
    public void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Reverses the stack using simple
    // linked list reversal logic.
    public Node reverse() {
        // Write your code here.
        Node p1 = top;
        if(top==null||top.next==null)
            return top;
        Node p2 = top.next;
        if(top.next.next==null){
            p2.next=p1;
            p1.next=null;
            top=p2;
            return top;
        }
        Node p3 = p2.next;
        p1.next=null;
        do {
            p2.next=p1;
            p1=p2;
            p2=p3;
            if(p3.next==null) {
                p3.next = p1;
                top = p3;
                return top;
            }
            p3=p3.next;
        } while(p3.next!=null);
        p2.next=p1;
        p3.next=p2;
        top = p3;
        return top;
    }

    public static void main(String[] args) {
        ReverseAStack obj = new ReverseAStack();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            obj.push( in .next().charAt(0));

        }

        obj.display(obj.top);
        System.out.println(" ");
        // reverse
        Node temp = obj.reverse();
        obj.display(temp);


    }
}