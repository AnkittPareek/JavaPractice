package com.company;
import java.util.Scanner;

    class RemoveLoopINSinglyLL {

        static Node headNode;

        /* Structure of the node of linked list */
        static class Node {

            /* data of the node*/
            int data;

            /* This is used to point the next node of
            the currNode node */
            Node next;

            Node(int value) {
                data = value;
                next = null;
            }
        }

        /* This method does the following:
        1. If there is a loop in the linked list, it should print 'Yes'
        and remove the loop in the linked list and return the head node.
        2. If there is no loop in the linked list, it should print 'No'
        and return the head node of the linked list. */
        Node removeLoop(Node head, int size) {
            Node temp = head;
            for(int i = 0; i <size ; i++){
                if (i<size-1)
                    temp = temp.next;
            }
            if (temp.next != null) {
                System.out.println("Yes");
                temp.next = null;
            }
            else
                System.out.println("No");
            return head;
        }

        /* This method adds a new node with data 'newData' to
        the front of the linked list*/
        public void addAtHead(int newData) {

            /* Create a new Node of data newData */
            Node newNode = new Node(newData);

            /* Now, set the next of the newNode as headNode */
            newNode.next = headNode;

            /* Next, make this newNode as head*/
            headNode = newNode;
        }


        /* This method prints every node of the linked list from the head,
        separating by a space */
        void printLinkedList(Node head) {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }
        }


        // Driver program to test above functions
        public static void main(String[] args) {
            RemoveLoopINSinglyLL list = new RemoveLoopINSinglyLL();

            Scanner in = new Scanner(System.in);

            /* Get the number of nodes of the linked list from input */
            int n = in.nextInt();

            /* Get all nodes of the linked list from input */
            for (int i = 0; i < n; i++) {
                list.addAtHead(in.nextInt());
            }

            /* Get the value of k from input */
            int k = in.nextInt();

       /* Creating a loop, by making the next node of the last node
        as the kth node from the head of the linked list */
            if (k != 0) {
                Node first = headNode, last;
                for (int i = 0; i < k; i++) {
                    first = first.next;
                }
                last = first;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = first;
            }

            /* Print the linked list after removing the loop */
            list.printLinkedList(list.removeLoop(headNode, n));
        }
    }